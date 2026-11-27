package com.AiTicketTriage.TicketTriage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing 
public class TicketTriageApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketTriageApplication.class, args);
	}

}
