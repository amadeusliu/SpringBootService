FROM java:8-jdk
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 9986
ENTRYPOINT ["java","-jar","/app.jar"]
