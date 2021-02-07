FROM adoptopenjdk/openjdk11
ADD ./target/password-generator.jar /password-generator.jar
EXPOSE 8080
CMD ["java","-jar", "password-generator.jar"]
