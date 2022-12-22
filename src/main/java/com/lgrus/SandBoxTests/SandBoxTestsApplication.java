package com.lgrus.SandBoxTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SandBoxTestsApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SandBoxTestsApplication.class, args);
		AppEntryPointRunner bean = context.getBean(AppEntryPointRunner.class);
		bean.runApp();
	}
}
