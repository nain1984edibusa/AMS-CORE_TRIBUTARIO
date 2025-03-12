package gob.mdmq.coretributario.msnegociogestiontributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioGestionTributoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioGestionTributoApplication.class, args);
	}
}
