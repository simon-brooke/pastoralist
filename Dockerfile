FROM openjdk:8-alpine

COPY target/uberjar/pastoralist.jar /pastoralist/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/pastoralist/app.jar"]
