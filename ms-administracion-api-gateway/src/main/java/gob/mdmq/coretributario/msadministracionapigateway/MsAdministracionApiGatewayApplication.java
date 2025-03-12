package gob.mdmq.coretributario.msadministracionapigateway;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import io.micrometer.prometheus.PrometheusMeterRegistry;



@EnableDiscoveryClient
@SpringBootApplication
public class MsAdministracionApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdministracionApiGatewayApplication.class, args);
	}
}
