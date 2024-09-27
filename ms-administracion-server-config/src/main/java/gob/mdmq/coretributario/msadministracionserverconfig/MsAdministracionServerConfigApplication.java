package gob.mdmq.coretributario.msadministracionserverconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.prometheus.PrometheusMeterRegistry;

@EnableConfigServer
@SpringBootApplication
@Configuration
public class MsAdministracionServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdministracionServerConfigApplication.class, args);
	}
	
	  @Value("${spring.application.name}")
	  String appName;

	  @Bean
	  MeterRegistryCustomizer<PrometheusMeterRegistry> configureMetricsRegistry()
	  {
	    return registry -> registry.config().commonTags("application", appName);
	  }
}
