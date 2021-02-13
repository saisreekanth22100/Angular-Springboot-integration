package com.app.fullstack.codechallenge.backendservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		//http://localhost:8300/swagger-ui/index.html  end point to check all resources
		return new Docket(DocumentationType.SWAGGER_2);

	}

}