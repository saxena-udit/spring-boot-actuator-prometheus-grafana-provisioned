# spring-boot-sample
This is sample spring boot actuator project for execution time tracking

It uses spring boot actuator, micrometer , spring aop to track execution time

### Application URLS
| URL                        | Description                              |
|----------------------------|------------------------------------------|
| localhost:8080/hello       | Sample application end Point             |
| localhost:8080/actuator    | Actuator end point                       |
    
### AOP time Logging with custom metric
Execution time metric will be recorded for all methods with TrackTime annotation

### Prometheus time logging using annotation
Annotation io.micrometer.core.annotation.Timed


