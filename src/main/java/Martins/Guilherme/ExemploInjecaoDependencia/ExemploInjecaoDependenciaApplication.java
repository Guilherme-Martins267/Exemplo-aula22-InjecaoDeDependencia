package Martins.Guilherme.ExemploInjecaoDependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExemploInjecaoDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploInjecaoDependenciaApplication.class, args);

		Continental continental = applicationContext.getBean(Continental.class);
				continental.execute();
	}

}