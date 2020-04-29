FROM openjdk:11-jdk
LABEL maintainer="Uday"

COPY /build/libs/location-0.0.1-SNAPSHOT.jar /

EXPOSE 8082

ENV JAVA_OPTIONS ""
CMD ["sh", "-c", "java ${JAVA_OPTIONS} -jar /location-0.0.1-SNAPSHOT.jar"]