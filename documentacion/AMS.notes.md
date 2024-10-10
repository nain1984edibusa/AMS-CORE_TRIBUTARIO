# AMS - Notes

## Referencias
* https://www.youtube.com/watch?v=80zkdQJ2y4c&list=PLxy6jHplP3Hi_W8iuYSbAeeMfaTZt49PW
* https://www.youtube.com/@unprogramadornace/videos
* https://www.youtube.com/watch?v=IPWBQDMIYkc

Rutas
* https://www.youtube.com/watch?v=yOlaImDMaG8

## DEPLOY - RENDER
https://www.youtube.com/watch?v=4X-jLAI6rDg

## DOCKER - SQL-
https://www.youtube.com/watch?v=Z6d5AhagDwc


## MONITOREO - PROMETHEUS - GRAFANA

https://www.youtube.com/watch?v=vn2Sk52gxCM

https://yoandroide.xyz/agregar-actuator-grafana-prometheus-a-spring-boot/

Rastreo y Monitoreo - Microservicios con Spring Boot

https://www.youtube.com/watch?v=doGYvlvmN6s

https://github.com/uncle-dave-code/microservices/blob/master/files/prometheus.yml



AUTOPAPER .NET
https://www.youtube.com/watch?v=pr_pemcmVAs

docker run -p 9090:9090 -v C:/AmbDesarrollo/AMS-CORE_TRIBUTARIO/monitoring/config/prometheus.yml:/etc/prometheus/prometheus.yml --name prom/prometheus



docker run --name my-prometheus \
    --mount type=bind,source=/C:/AmbDesarrollo/AMS-CORE_TRIBUTARIO/monitoring/config/prometheus.yml,destination=/etc/prometheus/prometheus.yml \
    -p 9090:9090 \
    --add-host host.docker.internal=host-gateway \
    prom/prometheus
	
	
	http://localhost:8081/api/v1/parametro/45
	
	{uri="/api/v1/parametro/{id}"}
	
	
	microservicios -
	angular -
	frontend - firebase
	api - render
	
	Adiós Heroku! 7 alternativas mucho mejores que Heroku
	https://www.youtube.com/watch?v=q--_5p15HnU
	
	Railway
	
	Configura y desarrolla microservicios para desplegarlos en Docker
	https://www.youtube.com/watch?v=d0TqQrVD38Q&t=228s
	es recomendable CREAR una base en docker
	los contenedores son efimeros cada vez que mueren pierden toda la inf. buscar mecanismos para persistir la informacion (volumenes)
	utilizar servicios de RDS () MANEJAN ALTADISPONIBILIDAD
	KUBERNITES MANEJA LA ALTA DISPONIBILIDAD
	
	
	/*musica*/

https://www.youtube.com/watch?v=WdhwU_JCINw	
