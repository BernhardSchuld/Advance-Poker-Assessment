package com.advance.PokerTest;

import com.advance.PokerTest.services.PokerEngine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class PokerTestApplication implements CommandLineRunner {
	private final PokerEngine pokerEngine;

	public PokerTestApplication(PokerEngine pokerEngine) {
		this.pokerEngine = pokerEngine;
	}


	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(PokerTestApplication.class, args);

		ctx.close();
	}

	@Override
	public void run(String... args) throws Exception {

		pokerEngine.start();
	}
}
