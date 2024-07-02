FROM openjdk:21-slim

COPY target/Poc-ConfigMap-Native-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080

ENTRYPOINT java -jar app.jar