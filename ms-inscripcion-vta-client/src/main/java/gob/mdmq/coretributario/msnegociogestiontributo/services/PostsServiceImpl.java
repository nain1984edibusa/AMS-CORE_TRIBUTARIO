package gob.mdmq.coretributario.msnegociogestiontributo.services;

import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import gob.mdmq.coretributario.msnegociogestiontributo.dto.PostsDto;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.reactor.circuitbreaker.operator.CircuitBreakerOperator;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

@Service
public class PostsServiceImpl implements PostsService {

	private final WebClient webClient;
	private final CircuitBreaker circuitBreaker;

	public PostsServiceImpl(WebClient.Builder webClientBuilder, CircuitBreakerRegistry registry) {
		// Realiza la llamada al microservicio `ms-negocio-gestion-inscripcion-vta`
		this.webClient = webClientBuilder.baseUrl("http://localhost:8887/ms-negocio-gestion-inscripcion-vta").build();
		this.circuitBreaker = registry.circuitBreaker("cbObtenerInscripcion");
	}

	public Flux<PostsDto> obtenerInformacion() {
		return webClient.get()
				.uri("/api/v1/inscripcion-vta") // Endpoint del microservicio de destino
				.retrieve()
                .bodyToFlux(PostsDto.class)
                .timeout(Duration.ofSeconds(60))
                .transformDeferred(CircuitBreakerOperator.of(circuitBreaker))
                .onErrorResume(throwable -> {
                    System.err.println("Error al realizar la solicitud: " + throwable.getMessage());
                    return Flux.empty(); // Fallback en caso de error
                });
	}
}
