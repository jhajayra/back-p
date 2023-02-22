FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /backultimo

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
COPY --from=build /backultimo/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]