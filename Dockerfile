# Use Ubuntu as the base image
FROM ubuntu:latest

# Install OpenJDK (Java Runtime Environment)
RUN apt-get update && apt-get install -y openjdk-17-jdk

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY  Miniproject_Calculator.jar /app/Miniproject_Calculator.jar

# Expose a port if needed (Optional)
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "/app/Miniproject_Calculator.jar"]



