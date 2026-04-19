package com.ragav.parkinglot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ParkinglotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotApplication.class, args);
	}

}
