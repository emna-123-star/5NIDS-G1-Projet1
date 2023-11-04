FROM openjdk11
EXPOSE 8082
ADD target/gestion-station-ski-1.0.jar ski-1.0.jar
ENTRYPOINT ["java","-jar","/ski-1.0.jar"]