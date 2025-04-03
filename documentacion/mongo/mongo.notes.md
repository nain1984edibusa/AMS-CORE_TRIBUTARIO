# Configurar Mongo
## Referencias

* https://www.tutorialesprogramacionya.com/mongodbya/detalleconcepto.php?punto=3&codigo=3&inicio=0
https://github.com/alejandrocalderonhernandez/docker-compose-img/tree/master/mongodb/data
https://www.youtube.com/watch?v=iVEt-iB8KXk

## Imagen - Con Docker
```
docker pull mongodb/mongodb-community-server:latest
```

## Instalacion - Con Docker (funciono!!)
```
docker run --name parametro-dev -p 27017:27017 -d mongodb/mongodb-community-server:latest
```

## Mongo shell
```
docker exec -it mongo-dev mongosh
```
use db_parametro_dev
```
db.COR_PARAMETROS.insertOne(
  {
    PARAMETRO_ID: 1,  
    DESCRIPCION_PARAMETRO: 'MATERIALIDAD EXTENSIVOS',
    VALOR_NUMERICO: '166.57',
    VALOR_CARACTER: ''
  }
)


db.COR_PARAMETROS.find()

use tutorial
collection products

db.COR_products.insertOne(
  {
    parametroId: 1,  
    descripcionParametro: 'Materialidad',
    valorNumerico: 100,
    valorCaracter: ''
  }
)

db.products.insertOne(
  {
    id: 1,  
    name: 'Materialidad',
    price: 100,
  }
)
```

http://localhost:8092/parametro

http://localhost:8092/parametro
{
	"descripcionParametro" : "MATERIALIDAD EXTENSIVOS",
	"valorNumerico" : 166.57,
	"valorCaracter" : null
}