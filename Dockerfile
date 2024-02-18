FROM openjdk
COPY target/satish.jar satish.jar
ENTRYPOINT ["java","-jar","/satish.jar"]