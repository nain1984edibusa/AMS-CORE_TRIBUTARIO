package gob.mdmq.coretributario.msnegociogestiontributo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioGestionTributoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioGestionTributoApplication.class, args);
	}

}
