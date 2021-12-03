package com.ibu.merchants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableEurekaClient
public class MerchantsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantsApplication.class, args);
	}

}
