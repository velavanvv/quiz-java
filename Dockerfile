# Use an official Maven runtime as a parent image with JDK 17
FROM maven:3.8.5-openjdk-17 as build
COPY . .
RUN mvn clean package -DskipTests








# Use an official Java runtime as a parent image with JDK 17
FROM openjdk:17.0.1-jdk-slim
VOLUME /tmp

# Copy the jar file from the build stage
COPY target/codingtechniques_tutorial-0.0.1-SNAPSHOT.jar codingtechniques_tutorial.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/codingtechniques_tutorial.jar"]