package gob.mdmq.coretributario.msparametrizacion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import io.micrometer.prometheus.PrometheusMeterRegistry;

@EnableDiscoveryClient
@SpringBootApplication
public class MsParametrizacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsParametrizacionApplication.class, args);
	}

	@Value("${spring.application.name}")
	  String appMsParametrizacion;

	  @Bean
	  MeterRegistryCustomizer<PrometheusMeterRegistry> configureMetricsRegistry()
	  {
	    return registry -> registry.config().commonTags("application", appMsParametrizacion);
	  }	
}
