FROM openjdk:8-jdk-alpine
EXPOSE 8089
ADD target/gestion-station-ski-1.0.jar gestion-station-ski-1.0.jar
ENTRYPOINT ["java","-jar","/gestion-station-ski-1.0.jar"]


# Use an official Java 11 runtime as a parent image
#FROM openjdk:8-jdk-slim
# Set the working directory inside the container
#WORKDIR /app

# Copy the application JAR file from the target directory into the container
#COPY target/gestion-station-ski-1.0.jar gestion-station-ski.jar

# Expose a port (change the port number if necessary)
#EXPOSE 8080

# Define the command to run the application when the container starts
#CMD ["java", "-jar", "gestion-station-ski.jar"]


#FROM openjdk:11
#EXPOSE 8082
#ADD target/gestion-station-ski-1.0.jar gestion-station-ski-1.0.jar
#ENTRYPOINT ["java","-jar","/gestion-station-ski-1.0.jar"]
