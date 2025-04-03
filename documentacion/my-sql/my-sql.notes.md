# Configurar sql-server
## Referencias

* https://faztweb.com/contenido/docker-microsoft-sql-server#google_vignette
* https://www.youtube.com/watch?v=Z6d5AhagDwc

## Imagen - Con Docker
```
docker pull mysql
```

## Instalacion - Con Docker (funciono!!)
```
 docker run -d --name db_security-dev -e "MYSQL_DATABASE=db_security" -e "MYSQL_USER=uncledave" -e "MYSQL_PASSWORD=Test@123" -e "MYSQL_ROOT_PASSWORD=root" -p 3307:3306  mysql

```