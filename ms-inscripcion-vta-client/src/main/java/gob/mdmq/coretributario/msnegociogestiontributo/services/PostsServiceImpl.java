package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.PostsDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@Service
public class PostsServiceImpl implements PostsService {

	private static final Logger logger = LoggerFactory.getLogger(PostsServiceImpl.class);
	public static final String DEPARTMENT_SERVICE = "departmentService";
	private final WebClient webClient;

	public PostsServiceImpl(WebClient.Builder webClientBuilder) {
		/*Realiza la llamada al microservicio `ms-negocio-gestion-inscripcion-vta`*/
		this.webClient = webClientBuilder.baseUrl("http://localhost:8887/ms-negocio-gestion-inscripcion-vta").build();
	}

	@CircuitBreaker(name = "Obtene_Informacion", fallbackMethod = "fallbackObtenerInformacion")
	public Flux<PostsDto> obtenerInformacion() {
		logger.info("Obteniendo información desde el microservicio...");
		/*Endpoint del microservicio de destino`*/
		return webClient.get().uri("/api/v1/inscripcion-vta") 
				/*Tiempo máximo permitido`*/
				.retrieve().bodyToFlux(PostsDto.class).timeout(Duration.ofSeconds(60)) // Tiempo máximo permitido
				.doOnSubscribe(subscription -> logger.info("Solicitud enviada al microservicio..."))
				.doOnNext(response -> logger.info("Respuesta recibida: {}", response)).doOnError(error -> logger
						.error("Error en la comunicación con el microservicio: {}", error.getMessage(), error));
	}
	
	// Método de fallback
	private Flux<PostsDto> fallbackObtenerInformacion(Throwable t) {
		logger.warn("CircuitBreaker activado - Fallback ejecutado debido a: {}", t.getMessage());
		Flux<PostsDto> lista = Flux.just(new PostsDto("1721965182001", "Eduardo Bustillos"))
				.delaySequence(Duration.ofSeconds(3));
		return lista;
	}
}
