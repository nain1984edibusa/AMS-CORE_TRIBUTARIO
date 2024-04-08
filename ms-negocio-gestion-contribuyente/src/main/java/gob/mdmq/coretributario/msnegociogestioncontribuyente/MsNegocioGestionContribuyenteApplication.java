package gob.mdmq.coretributario.msnegociogestioncontribuyente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsNegocioGestionContribuyenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNegocioGestionContribuyenteApplication.class, args);
	}

}
