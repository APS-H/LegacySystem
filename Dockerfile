FROM openjdk:8u171-alpine

ADD ./schema/*.csv /run/schemas/
ADD ./target/legacy-0.0.1-SNAPSHOT.jar /run/

EXPOSE 9000 9001 9002 9003

ENTRYPOINT ["java", "-jar", "/run/legacy-0.0.1-SNAPSHOT.jar"]
