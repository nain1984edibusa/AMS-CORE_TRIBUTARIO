package gob.mdmq.coretributario.msnegociogestioncontribuyente;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import io.micrometer.prometheus.PrometheusMeterRegistry;

@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioGestionContribuyenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioGestionContribuyenteApplication.class, args);
	}

	@Value("${spring.application.name}")
	  String appMsNegocioGestionContribuyente;

	  @Bean
	  MeterRegistryCustomizer<PrometheusMeterRegistry> configureMetricsRegistry()
	  {
	    return registry -> registry.config().commonTags("application", appMsNegocioGestionContribuyente);
	  }
}
