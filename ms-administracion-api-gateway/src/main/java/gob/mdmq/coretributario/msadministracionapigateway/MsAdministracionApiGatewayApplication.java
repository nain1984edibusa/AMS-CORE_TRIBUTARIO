package gob.mdmq.coretributario.msadministracionapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsAdministracionApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdministracionApiGatewayApplication.class, args);
	}

}
