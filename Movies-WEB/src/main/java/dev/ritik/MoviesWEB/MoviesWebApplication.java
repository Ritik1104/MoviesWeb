package dev.ritik.MoviesWEB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


public class MoviesWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesWebApplication.class, args);
	}


}
