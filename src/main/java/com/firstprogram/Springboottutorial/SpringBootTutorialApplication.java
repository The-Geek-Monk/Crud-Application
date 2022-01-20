package com.firstprogram.Springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

}
