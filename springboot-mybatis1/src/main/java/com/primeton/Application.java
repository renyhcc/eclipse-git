package com.primeton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
@ComponentScan(basePackages = { "com.primeton.spring_root_mybatis" })
//aiyouwocao 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
