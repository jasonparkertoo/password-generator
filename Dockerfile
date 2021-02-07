FROM java:8-jdk-alpine
WORKDIR /usr/app
COPY ./target/password-generator.jar /usr/app
EXPOSE 8080
ENTRYPOINT ["java","-jar","password-generator.jar"]
