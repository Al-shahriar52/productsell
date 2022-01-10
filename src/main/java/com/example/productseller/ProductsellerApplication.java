package com.example.productseller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
@SpringBootApplication
public class ProductsellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsellerApplication.class, args);
	}

}
