# docker build -t greeting-service .
# docker container run -d -p 8080:8080 greeting-service

FROM adoptopenjdk/openjdk11
COPY target/greeting-service-0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-Xmx128m", "-jar", "greeting-service-0.1-SNAPSHOT.jar"]
