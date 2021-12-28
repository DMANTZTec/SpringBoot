package com.springboot.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
@Configuration
@EnableSwagger2
public class BookConfig {
	
	@Bean
	public Docket postApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("spring-boot").apiInfo(apiInfo()).select()
	            .paths(regex("/book.*")).build();
		
		/*
		 @Bean
		 public Docket swaggerApiConfig(){
		 return new Docket(DocumentationType.SWAGGER_2)
		 .select()
		        .paths(PathSelectors.any())
		        .apis(RequestHandlerSelectors.basePackage("com.springboot"))
		        .build()
		        .apiInfo(apiInfo());*/
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("xxx")
				.termsOfServiceUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ")
				.license("Java_Gyan_Mantra_License")
				.licenseUrl("https://www.youtube.com/channel/UCORuRdpN2QTCKnsuEaeK-kQ").version("1.0").build();
		
	}

}
