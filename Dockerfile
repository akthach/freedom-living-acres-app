FROM openjdk:8u111-jdk-alpine
COPY build/libs/freedom-living-acres-app.jar app.jar
EXPOSE 80 8080
ENTRYPOINT ["java","-jar","/app.jar"]