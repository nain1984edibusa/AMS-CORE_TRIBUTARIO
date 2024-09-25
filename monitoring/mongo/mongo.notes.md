# Configurar Mongo
## Referencias

* https://www.tutorialesprogramacionya.com/mongodbya/detalleconcepto.php?punto=3&codigo=3&inicio=0

## Imagen - Con Docker
```
docker pull mongodb/mongodb-community-server:latest
```

## Instalacion - Con Docker (funciono!!)
```
docker run --name mongo-dev -p 27017:27017 -d mongodb/mongodb-community-server:latest
```

## Mongo shell
```
docker exec -it mongo-dev mongosh
```
use MDMQ_CORE_TRIBUTARIO
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
```