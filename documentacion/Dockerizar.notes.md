# AMS - Notes

## Referencias
* https://www.youtube.com/watch?v=80zkdQJ2y4c&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW
* https://www.youtube.com/@unprogramadornace/videos
* https://www.youtube.com/watch?v=IPWBQDMIYkc
* https://es.stackoverflow.com/questions/65317/como-instalar-maven-en-windows

Rutas
* https://www.youtube.com/watch?v=yOlaImDMaG8

## DEPLOY - RENDER
https://www.youtube.com/watch?v=4X-jLAI6rDg


## DOCKERIZAR

Instalar Maven:

1.-Descarga los binarios en zip.
2.- Coloca el zip en un directorio deseado, por ejemplo en raiz "C:\" , quedando la ruta completa: C:\apache-maven-3.2.2.zip
3.- Descomprimir zip con winrar o 7zip por ejemplo.
4.- A descomprimir los binarios, se crearà una carpeta C:\apache-maven-3.2.2, dentro de ese directorio se encuentran los binarios de maven.
Una vez colocado y descomprimido maven, crea las variables de entorno.

Pre-requisitos: Variables de entorno java

JAVA_HOME C:\Program Files\Java\jdk1. 7.0_17.
Variables para maven:

M2= %M2_HOME%\bin

M2_HOME= C:\apache-maven-3.2.2

Path ...; C:\apache-maven-3.2.2\bin; ...

Mi sugerencia es reiniciar el pc al termino de crear las variables de entorno.

Al reiniciar, abrir una consola CMD y teclear lo siguiente:

mvn -version

Si todo quedo Ok, verà un mensaje :

C:\Users\xxx>mvn -version Apache Maven 3.2.2 (45f7c06d68e745d05611f7fd14efb6594181933e; 2014-06-17T08:51:42-05:00) Maven home: C:\apache-maven-3.2.2 Java version: 1.6.0_35, vendor: Sun Microsystems Inc. Java home: C:\Program Files\Java\jdk1.6.0_35\jre Default locale: es_MX, platform encoding: Cp1252 OS name: "windows 7", version: "6.1", arch: "amd64", family: "windows" C:\Users\xxx>

Està salida es con la versión: apache-maven-3.2.2

## DOCKERIZAR - generar .jar

C:\AmbDesarrollo\AMS-CORE_TRIBUTARIO\demo\mvn -v
C:\AmbDesarrollo\AMS-CORE_TRIBUTARIO\demo\mvn package

C:\AmbDesarrollo\AMS-CORE_TRIBUTARIO\demo\target>java -jar demo-0.0.1-SNAPSHOT.jar

C:\AmbDesarrollo\AMS-CORE_TRIBUTARIO\demo>docker build -t demo-v1 .

C:\AmbDesarrollo\AMS-CORE_TRIBUTARIO\demo>docker run -p 8082:8082 demo-v1



## DOCKERIZAR GRADLE - generar .jar
Crear el build del proyecto
gradle clean build

Ejecutar el jar
java -jar ms-administracion-server-registry-0.0.1-SNAPSHOT.jar


docker build -t ms-administracion-server-registry .
docker run -p 8889:8889 ms-administracion-server-registry


Crear el build del proyecto
gradle clean build

Ejecutar el jar
java -jar ms-administracion-server-config-0.0.1-SNAPSHOT.jar


docker build -t ms-administracion-server-config .
docker run -p 8888:8888 ms-administracion-server-config

