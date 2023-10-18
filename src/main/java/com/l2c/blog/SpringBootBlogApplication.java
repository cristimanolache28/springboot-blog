package com.l2c.blog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot Blog App REST APIs",
				description = "Spring Boot Blog App REST API documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Cristi",
						email = "cristianmanolache0@gmail.com",
						url = "https://github.com/cristimanolache28"
				)
		),
		externalDocs = 	@ExternalDocumentation(
				description = "Spring Boot Blog App Documentation",
				url = "https://github.com/cristimanolache28/springboot-blog"
		)

)
public class SpringBootBlogApplication {

	private ModelMapper modelMapper;

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBlogApplication.class, args);
	}

}
