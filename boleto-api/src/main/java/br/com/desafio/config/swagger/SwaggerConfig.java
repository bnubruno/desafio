package br.com.desafio.config.swagger;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apis() {
		return new Docket(DocumentationType.SWAGGER_2) 
				.select().apis(RequestHandlerSelectors.basePackage("br.com.desafio")).paths(PathSelectors.any()).build().apiInfo(apiInfo()).useDefaultResponseMessages(false);
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Desafio - Boletos", 
				"API Rest para geração de boletos", 
				"1.0.0", 
				"Termos de licensa de uso de software", 
				null, 
				"https:github.com/bnubruno/desafio", 
				"/", 
				new ArrayList<>());
	}

}
