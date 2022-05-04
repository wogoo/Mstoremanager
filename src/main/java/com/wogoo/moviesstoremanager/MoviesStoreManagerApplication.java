package com.wogoo.moviesstoremanager;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = MoviesStoreManagerApplication.MOVIES_API, version = MoviesStoreManagerApplication.VERSION_API, description = MoviesStoreManagerApplication.API_DESC_DOC))
public class MoviesStoreManagerApplication {

	public static final String MOVIES_API = "MSM API";
	public static final String VERSION_API = "0.0.1";
	public static final String API_DESC_DOC = "MSM Information";

	public static void main(String[] args) {
		SpringApplication.run(MoviesStoreManagerApplication.class, args);
	}

}
