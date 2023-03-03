# spring-boot-sample
This is sample spring boot actuator project for execution time tracking

It uses spring boot actuator, micrometer , spring aop to track execution time


### AOP time Logging with custom metric
Execution time metric will be recorded for all methods with TrackTime annotation

### Prometheus time logging using annotation
Annotation io.micrometer.core.annotation.Timed applied on Measurable Interface

### Creating schema using flyway
It creates database with versioning. https://flywaydb.org/documentation/getstarted/how
It need a specific file name structure "V1.1__script_name.sql". Here version is V1.1.

### Running it locally
`docker compose up -d --build`

### Stopping locally

`docker compose down`

### Application URLS
| URL                                | Description                              |
|------------------------------------|------------------------------------------|
| localhost:8080/demo                | Sample application end Point             |
| localhost:8080/user                | User Controller end point                |
| localhost:8080/actuator            | Actuator end point                       |
| localhost:8080/actuator/prometheus | application prometheus metrics end point |
| localhost:9090                     | Prometheus                               |
| localhost:3000                     | Grafana                                  |

### Exposing User Repository with annotation RepositoryRestResource 
| URL                                                     | Description                               |
|---------------------------------------------------------|-------------------------------------------|
| http://localhost:8080/userdata                              | List all users                            |
| http://localhost:8080/userdata/search/findByName?name=udit  | Search based on method name at Repository |

### Grafana Pre loaded dashboard
Preloaded grafana interface for spring boot
https://grafana.com/grafana/dashboards/6756-spring-boot-statistics/.
One extra Panel added "**Request Count by End point**"

1. Open Grafana Dashboard http://localhost:3000/dashboards
2. Login Using admin as username and password
3. Click on "Spring boot Statistics" under "General" folder
4. Input Instance as "web:8080"
