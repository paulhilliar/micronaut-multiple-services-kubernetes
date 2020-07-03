# docker build -t name-service .
# docker container run -d -p 8080:8080 name-service

FROM adoptopenjdk/openjdk11
COPY target/name-service-0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-Xmx128m", "-jar", "name-service-0.1-SNAPSHOT.jar"]
