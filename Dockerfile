FROM alpine:3.13.1
RUN apk add --no-cache openjdk11-jre-headless && \
       addgroup -S appgroup && \
       adduser -S appuser -G appgroup
USER appuser
WORKDIR /usr/app
COPY ./target/password-generator*.jar /usr/app/password-generator.jar
EXPOSE 8080
CMD java -jar password-generator.jar
