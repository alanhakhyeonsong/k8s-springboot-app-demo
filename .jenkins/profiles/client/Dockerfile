FROM openjdk:21-slim

CMD ["./gradlew", "clean", "build"]

VOLUME /tmp

ARG JAR_FILE=build/libs/k8s-demo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} ramos-demo.jar

EXPOSE 8081

ENTRYPOINT ["java","-Duser.timezone=UTC","-Dspring.profiles.active=dev,client","-jar","/ramos-demo.jar"]