package com.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoApplication {

	public static void main(String[] args) {
		// It is demo app so on cloud It should not run for forever accidentally
		killAfterSomeTime();

		SpringApplication.run(DemoApplication.class, args);

	}

	private static void killAfterSomeTime() {
		long timeToKill = 1000 * 60 * 10;
		new Timer("ShutDown Timer").schedule(new TimerTask() {
			@Override
			public void run() {
				System.exit(0);
			}
		}, timeToKill);
	}

}
