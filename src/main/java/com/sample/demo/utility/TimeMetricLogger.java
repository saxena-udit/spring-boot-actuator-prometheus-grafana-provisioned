package com.sample.demo.utility;

import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Aspect
@Component
@Slf4j
public class TimeMetricLogger {

    MeterRegistry registry;

    public TimeMetricLogger(MeterRegistry registry) {
        this.registry = registry;
    }

    @Around("@annotation(com.sample.demo.utility.TrackTime)")
    public Object logTime(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        String name = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        log.info("Method " + name + " execution started at:" + LocalDateTime.now());
        try {
            return joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        } finally {
            long end = System.currentTimeMillis();
            long time = end - start;
            log.info("Method " + name + " execution lasted:" + time + " ms");
            log.info("Method " + name + " execution ended at:" + LocalDateTime.now());
            this.registry.timer(name).record(time, TimeUnit.MILLISECONDS);
            if (time > 10) {
                log.warn("Method execution longer than 10 ms!");
            }
        }
    }

}
