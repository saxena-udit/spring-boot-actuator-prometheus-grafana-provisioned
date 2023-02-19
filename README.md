# spring-boot-sample
This is sample spring boot actuator project for execution time tracking

It uses spring boot actuator, micrometer , spring aop to track execution time

### Actuator URLS
| URL                        | Description                              |
|----------------------------|------------------------------------------|
| localhost:8080/hello       | Sample application end Point             |
| localhost:8080/actuator    | Actuator end point                       |
    
### AOP time Logging with custom metric
Execution time metric will be recorded for all methods with TrackTime annotation

### Prometheus time logging using annotation
Annotation io.micrometer.core.annotation.Timed

### Creating schema using flyway
It creates database with versioning. https://flywaydb.org/documentation/getstarted/how
It need a specific file name structure "V1.1__script_name.sql". Here version is V1.1.

### Exposing User Repository with annotation RepositoryRestResource 
| URL                                                     | Description                               |
|---------------------------------------------------------|-------------------------------------------|
| http://localhost:8080/user                              | List all users                            |
| http://localhost:8080/user/search/findByName?name=udit  | Search based on method name at Repository |
