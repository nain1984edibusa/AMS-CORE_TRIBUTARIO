# Configurar msautenticacion
## Referencias


## Imagen - Con Docker
```
docker images

docker ps

docker pull mysql
```

## Instalacion - Con Docker (funciono!!)
```
docker run -d --name db_security-dev -e "MYSQL_DATABASE=db_security" -e "MYSQL_USER=uncledave" -e "MYSQL_PASSWORD=Test@123" -e "MYSQL_ROOT_PASSWORD=root" -p 3307:3306  mysql

```

```
Pasos

	POST: http://localhost:8080/auth/register
    {
        "username": "eduardo.bustillos@quito.gob.ec",
        "password": "A123456a",
        "lastname": "Bustillos Allauca",
        "firstname": "Eduardo Marcelo",
        "country": "Ecuador"
    }
    
	
	POST: http://localhost:8080/auth/login
	
	 {
        "username": "eduardo.bustillos@quito.gob.ec",
        "password": "A123456a"
    }
    
    

```

