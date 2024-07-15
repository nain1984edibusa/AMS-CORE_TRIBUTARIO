package gob.mdmq.coretributario.msautorizacionserversecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsAutorizacionSeverSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAutorizacionSeverSecurityApplication.class, args);
	}

}
