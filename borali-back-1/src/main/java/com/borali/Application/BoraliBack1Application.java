package com.borali.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages="com.borali.Usuario")
public class BoraliBack1Application {

	public static void main(String[] args) {
		SpringApplication.run(BoraliBack1Application.class, args);
	}

}