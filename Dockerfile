FROM openjdk:8-jdk-alpine

ADD target/Customer-0.0.1-SNAPSHOT.jar Customer-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar"," Customer-0.0.1-SNAPSHOT.jar"]