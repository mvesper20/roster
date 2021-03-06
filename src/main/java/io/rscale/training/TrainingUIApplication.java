package io.rscale.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TrainingUIApplication {
	public static void main(String[] args) {

		SpringApplication.run(TrainingUIApplication.class, args);
	}
}
