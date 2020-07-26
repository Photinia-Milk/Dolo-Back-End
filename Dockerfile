FROM openjdk:15-jdk-alpine
WORKDIR /app
COPY target/*.jar /app
ENTRYPOINT ["java", "-jar", "dolo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080