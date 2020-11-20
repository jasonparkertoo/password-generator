FROM tomcat:jre8-alpine
ADD ./target/password-generator.war /usr/local/tomcat/webapps/password-generator.war
EXPOSE 8080
CMD ["catalina.sh","run"]
