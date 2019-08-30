package com.cadastro.produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "com.cadastro.produto.model")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = {"com.cadastro.produto.repository"})
@EnableTransactionManagement
public class SenaiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SenaiProjectApplication.class, args);
	}

}
