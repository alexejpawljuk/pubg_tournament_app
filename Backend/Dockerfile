FROM maven:3.9.9 AS build

WORKDIR /app

COPY pom.xml .
COPY src/main/resources/application.properties src/main/resources/
#COPY .mvn .mvn
#COPY mvnw .

RUN mvn dependency:go-offline
#RUN mvn install -DskipTests


COPY src src/

RUN mvn clean package -DskipTests



FROM openjdk:21-slim

WORKDIR /app

COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.war /app/app.war

CMD ["java", "-jar", "app.war"]
#ENTRYPOINT ["java", "-jar", "app.jar"]