package com.infnet.applicatioh2;

import org.springframework.boot.SpringApplication;

public class TestApplicatioh2Application {

	public static void main(String[] args) {
		SpringApplication.from(Applicatioh2Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
