FROM gradle:jdk11 AS build-env
WORKDIR /app
COPY build.gradle ./
COPY src ./src
RUN gradle bootJar
FROM openjdk:11-jre-slim
COPY --from=build-env /app/build/libs/*.jar /app.jar
CMD ["java","-jar","/app.jar"]