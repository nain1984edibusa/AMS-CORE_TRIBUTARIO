package gob.mdmq.coretributario.msnegociogestiontributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsNegocioGestionTributoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioGestionTributoApplication.class, args);
	}
//	@Value("${spring.application.name}")
//	  String appMsNegocioGestionInscripcionVta;
//
//	  @Bean
//	  MeterRegistryCustomizer<PrometheusMeterRegistry> configureMetricsRegistry()
//	  {
//	    return registry -> registry.config().commonTags("application", appMsNegocioGestionInscripcionVta);
//	  }
}
