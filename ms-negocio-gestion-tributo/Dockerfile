# Usa una imagen base de Java
FROM eclipse-temurin:17-jdk-alpine

# Configura el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado por Gradle
COPY build/libs/ms-negocio-gestion-tributo*.jar ms-negocio-gestion-tributo-0.0.1.jar

# Expone el puerto de la aplicación
EXPOSE 9999

# Configura el comando de inicio de la aplicación
ENTRYPOINT ["java", "-jar", "ms-negocio-gestion-tributo-0.0.1.jar"]