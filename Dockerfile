FROM openjdk:10-jre-slim

LABEL Name="Sample Test Service" \
            Product="Test Deployment"

EXPOSE 9090

RUN mkdir /container
COPY build/libs/sample-deployment-project-0.0.1-SNAPSHOT.jar /container/sample-project.jar

WORKDIR /container

ENTRYPOINT exec java $JAVA_OPTS -jar sample-project.jar