package com.console.supply;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SupplyApplication {

	private static Logger LOG = LoggerFactory
			.getLogger(SupplyApplication.class);

	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(SupplyApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}

}
