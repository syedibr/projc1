package com.ibu.deals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@SpringBootApplication
@EnableEurekaClient
public class DealsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealsApplication.class, args);
	}

}
