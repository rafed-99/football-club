FROM amazoncorretto:17.0.6

WORKDIR /app

COPY target/tournoietequipes-0.0.1-SNAPSHOT.jar /app/tournoietequipes-1.0.0.jar

EXPOSE 8089

ENTRYPOINT ["java", "-jar", "tournoietequipes-1.0.0.jar"]
