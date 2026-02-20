package com.adk.bookmrkly_api;

import org.springframework.boot.SpringApplication;

public class TestBookmrklyApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmrklyApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
