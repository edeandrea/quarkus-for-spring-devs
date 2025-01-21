package org.acme;

import org.springframework.boot.SpringApplication;

public class TestApplication {
	public static void main(String[] args) {
		SpringApplication
			.from(Chapter4SpringDataJpaApplication::main)
			.with(ContainersConfig.class)
			.run(args);
	}
}
