FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/Library-0.0.1-SNAPSHOT.jar springboot-docker.jar

EXPOSE 9090

CMD ["java", "-jar", "springboot-docker.jar"]
