FROM openjdk:19-alpine
MAINTAINER Lucas24865
COPY target/Lucas-Portfolio-Back-0.0.1-SNAPSHOT.jar Lucas-Portfolio-Back-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Lucas-Portfolio-Back-0.0.1-SNAPSHOT.jar"]