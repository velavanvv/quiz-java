# Use an official Maven runtime as a parent image with JDK 17
FROM maven:3.8.1-openjdk-17-slim as build








# Use an official Java runtime as a parent image with JDK 17
FROM openjdk:17-jre-slim
VOLUME /tmp

# Copy the jar file from the build stage
COPY target/ascii-art-generator-0.0.1-SNAPSHOT.jar ascii-art-generator.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/ascii-art-generator.jar"]