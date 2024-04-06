package com.vivekt.inv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestInvApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvApplication::main).with(TestInvApplication.class).run(args);
	}

}
