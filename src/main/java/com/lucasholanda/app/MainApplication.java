package com.lucasholanda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MainApplication {
	
	@Autowired
	Environment env;

	public static void main(String[] args) {

		SpringApplication.run(MainApplication.class, args);

	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void printProperties() {
		log.info("");
		log.info("                           APPLICATION STARTED                          ");
		log.info("");
		log.info("============================== PROPERTIES ==============================");
		log.info("");
		log.info("                Swagger : {}", String.format("http://localhost:%s%s", env.getProperty("server.port"), env.getProperty("springdoc.swagger-ui.path")));
		log.info("                      H2: {}", String.format("http://localhost:%s%s", env.getProperty("server.port"), env.getProperty("spring.h2.console.path")));
		log.info("");
		log.info("                 DB File: {}", "src/main/resources/data.sql");
		log.info("");
		log.info("============================= /PROPERTIES ==============================");
	}

}
