FROM openjdk:8
EXPOSE 8080
COPY test.jar /usr/local/bin/test.jar
CMD ["java","-jar","/usr/local/bin/test.jar"]
