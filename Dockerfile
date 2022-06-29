FROM openjdk:8-jdk
EXPOSE 8080
ARG JAR_FILE
ADD target/${JAR_FILE} /seckill-goods.jar
ENTRYPOINT ["java", "-jar","/seckill-goods.jar"]