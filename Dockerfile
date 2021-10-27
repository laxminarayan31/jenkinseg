FROM openjdk
ADD target/demoapp-0.0.1-SNAPSHOT.jar /
expose 8081:8081
cmd ["java","-jar","demoapp-0.0.1-SNAPSHOT.jar"]