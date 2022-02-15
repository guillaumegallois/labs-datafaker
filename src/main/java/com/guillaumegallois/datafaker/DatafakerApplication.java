package com.guillaumegallois.datafaker;

import net.datafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatafakerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DatafakerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker();
		System.out.println("name:" + faker.name().fullName());
		System.out.println("firstName:" + faker.name().firstName());
		System.out.println("lastName:" + faker.name().lastName());
		System.out.println("streetAddress:" + faker.address().streetAddress());
		System.out.println("star:" + faker.space().star());
	}
}
