FROM openjdk:11
ADD target/*.jar employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","employee-0.0.1-SNAPSHOT.jar" ]