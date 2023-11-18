FROM openjdk
COPY target/dockerone.jar dockerone.jar
ENTRYPOINT  ["java","-jar","/dockerone.jar"]