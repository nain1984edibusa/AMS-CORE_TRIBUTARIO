#FROM openjdk
#ADD build/libs/ms-negocio-gestion-inscripcion-vta_v2*.jar ms-negocio-gestion-inscripcion-vta_v2-0.0.1.jar
#EXPOSE 8193
#ENTRYPOINT ["java","-jar","ms-negocio-gestion-inscripcion-vta_v2-0.0.1.jar"]

# Usa una imagen base de Java
FROM eclipse-temurin:17-jdk-alpine

# Configura el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado por Gradle
COPY build/libs/*.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8193

# Configura el comando de inicio de la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
