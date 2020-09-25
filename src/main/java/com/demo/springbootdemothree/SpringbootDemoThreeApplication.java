package com.demo.springbootdemothree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringbootDemoThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoThreeApplication.class, args);
	}

}
