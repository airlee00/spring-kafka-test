package com.javainuse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {

	    new SpringApplicationBuilder(SpringBootHelloWorldApplication.class).build().run(args);
	}
}