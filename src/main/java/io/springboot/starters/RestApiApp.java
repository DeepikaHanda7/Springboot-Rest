package io.springboot.starters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"io.springboot.controllers", "io.spring.services"})
public class RestApiApp {
	
	public static void main(String[] args) {
		SpringApplication.run(RestApiApp.class,args);
	}
	
}
  