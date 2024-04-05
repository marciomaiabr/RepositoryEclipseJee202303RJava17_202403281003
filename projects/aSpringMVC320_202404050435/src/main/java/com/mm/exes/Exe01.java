package com.mm.exes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.mm.beans", "com.mm.mvc.controllers" })
public class Exe01 {

	public static void main(String[] args) {
		SpringApplication.run(Exe01.class, args);
	}

}
