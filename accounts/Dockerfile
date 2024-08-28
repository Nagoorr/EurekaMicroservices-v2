

# Use an official OpenJDK image as a base image
#FROM openjdk:17-jdk-alpine

# Set the working directory in the container
#WORKDIR /app

# Copy the Spring Boot JAR file into the container
#COPY target/your-app-name.jar app.jar

# Expose the port that your Spring Boot app runs on
#EXPOSE 8080

# Set the entry point to run the JAR file
#ENTRYPOINT ["java", "-jar", "app.jar"]

#docker build -t your-image-name .

#docker run -p 8080:8080 your-image-name

# Tag the image:

#docker tag your-image-name your-dockerhub-username/your-image-name
#Push the image to Docker Hub:

#Copy code
#docker push your-dockerhub-username/your-image-name

# Start with basic imag containing Java RuntTime which is present in docker desktop
#FROM openjdk:21-jdk-slim

# Information around who maintaines the image
#MAINTAINER sadam

# Add the application to the image
#COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#EXPOSE 8080

# execute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]