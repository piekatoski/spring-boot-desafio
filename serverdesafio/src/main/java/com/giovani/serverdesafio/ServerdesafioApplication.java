package com.giovani.serverdesafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServerdesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerdesafioApplication.class, args);
	}

}
