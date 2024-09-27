# Configurar Prometheus
## Referencias
* https://prometheus.io/docs/prometheus/latest/installation/
* https://www.tutorialworks.com/spring-boot-prometheus-micrometer/
C:\AmbDesarrollo\AMS-CORE_TRIBUTARIO\monitoring\config

## Levantar servidor
```
docker run -p 9090:9090 prom/prometheus

docker run --name prometheus-dev -d -p 127.0.0.1:9090:9090 prom/prometheus

#funcionó AMS
docker run --name prometheus-dev -d -p 127.0.0.1:9090:9090 -v C:/AmbDesarrollo/AMS-CORE_TRIBUTARIO/monitoring/config/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
```

```
docker run -p 9090:9090 -v /path/to/config:/etc/prometheus prom/prometheus

docker run -it -p 9090:9090  -v "$(pwd)/config/prometheus.yml":"/etc/prometheus/prometheus.yml" --name prometheus prom/prometheus

#funcionó AMS
docker run -p 9090:9090 -v C:/AmbDesarrollo/AMS-CORE_TRIBUTARIO/monitoring/config/prometheus.yml:/etc/prometheus/prometheus.yml 


docker run --name prometheus-dev -p 9090:9090 -v C:/AmbDesarrollo/AMS-CORE_TRIBUTARIO/monitoring/config/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus

--name prom/prometheus 

docker run -it -p 9090:9090  -v /Users/jcabelloc/workspaces/iTana/itana-demos/spring-monitoring-demo/config:/etc/prometheus --name prometheus prom/prometheus 
docker run --net=host -it -v "$(pwd)/config/prometheus.yml":"/etc/prometheus/prometheus.yml" --name prometheus prom/prometheus
```
* --net=host => no funciona para mac

## Acceder a Prometheus
```
http://localhost:9090/targets
```