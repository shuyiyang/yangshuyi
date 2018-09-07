FROM openjdk:8-jre-alpine
LABEL maintainer="yangshuyi<yangshuyi@yunjie-system.com>"
COPY target/*.jar /app.jar
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=test", "-Xmx200m", "-jar", "/app.jar"]
EXPOSE 9150