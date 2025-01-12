FROM openjdk:17
COPY ./target/*.jar /usr/app/app.jar
WORKDIR /usr/app
RUN sh -c 'touch your-jar-file-name.jar'
ENTRYPOINT ["java","-jar","app.jar"]