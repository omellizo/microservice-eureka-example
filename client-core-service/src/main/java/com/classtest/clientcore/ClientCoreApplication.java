package com.classtest.clientcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientCoreApplication.class, args);
	}

}
