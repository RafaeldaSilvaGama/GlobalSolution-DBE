package br.com.wecare.we_care_project;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@SwaggerDefinition
public class WeCareProjectApplication {



	public static void main(String[] args) {
		SpringApplication.run(WeCareProjectApplication.class, args);
	}

}
