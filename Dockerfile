FROM amazoncorretto:17-alpine-jdk

COPY target/backultimo-0.0.1-SNAPSHOT.jar jhaja.jar
ENTRYPOINT ["JAVA","-jar","/jhaja.jar"]