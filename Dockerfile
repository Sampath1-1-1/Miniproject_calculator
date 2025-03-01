FROM ubuntu:latest

RUN apt-get update && apt-get install -y openjdk-17-jdk

WORKDIR /app

COPY  Miniproject_Calculator.jar /app/Miniproject_Calculator.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/Miniproject_Calculator.jar"]



