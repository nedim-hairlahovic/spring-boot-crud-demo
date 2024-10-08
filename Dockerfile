# Stage 1: Build the project
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml files from parent and child module
COPY pom.xml ./
COPY spring-boot-crud-app/pom.xml spring-boot-crud-app/
COPY spring-boot-crud-module/pom.xml spring-boot-crud-module/

# Run maven dependency resolver to cache dependencies
RUN mvn dependency:go-offline -B

# Now copy the entire project into the container
COPY . .

# Build the Maven project
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the built jar from the first stage
COPY --from=build /app/spring-boot-crud-app/target/*.jar app.jar

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
