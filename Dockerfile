FROM maven:3.6.3-jdk-8-openj9
WORKDIR  /tmp/app_actuator/
COPY ./target/UserManager-0.0.1-SNAPSHOT.jar /tmp/app_actuator/UserManager.jar
#RUN mvn clean package -DskipTests

CMD ["java","-jar","/tmp/app_actuator/UserManager.jar"]
