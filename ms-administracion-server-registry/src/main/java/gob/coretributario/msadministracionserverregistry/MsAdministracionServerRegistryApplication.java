package gob.coretributario.msadministracionserverregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsAdministracionServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAdministracionServerRegistryApplication.class, args);
	}

}
