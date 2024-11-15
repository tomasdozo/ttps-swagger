package com.ttps.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SecurityScheme(name = "Autenticación TTPS" , type = SecuritySchemeType.HTTP, scheme = "Basic" )
@OpenAPIDefinition(info = @Info(title = "TTPS Api",description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tempus convallis tincidunt. Donec condimentum tempor dui a pellentesque. Nulla ut nulla vitae risus tristique consequat tincidunt nec sapien. Nullam non imperdiet nisi. Donec malesuada vitae urna vel tempus. Nunc ac pretium velit. Sed vulputate, leo vel posuere aliquet, massa orci iaculis nisi, ut sollicitudin lacus tortor vitae diam."))
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
