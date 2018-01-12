package com.munteanu.rmgroovyapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class RmGroovyAppApplication {

	static void main(String[] args) {
		SpringApplication.run RmGroovyAppApplication, args
	}
}
