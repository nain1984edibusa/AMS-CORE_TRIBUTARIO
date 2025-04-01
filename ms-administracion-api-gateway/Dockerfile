FROM openjdk:17-jdk-alpine
ADD build/libs/ms-administracion-api-gateway*.jar ms-administracion-api-gateway.jar
#EXPOSE 8889
ENTRYPOINT ["java","-jar","ms-administracion-api-gateway.jar"]