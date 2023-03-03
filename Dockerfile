FROM maven:3.8.3-openjdk-17
ADD . /code
WORKDIR /code
RUN mvn clean package -DskipTests=true
CMD mvn spring-boot:run