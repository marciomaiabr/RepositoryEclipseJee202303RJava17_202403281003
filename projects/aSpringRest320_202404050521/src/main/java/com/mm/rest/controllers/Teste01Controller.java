package com.mm.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.beans.specifications.Bean01Spec;

@RestController
public class Teste01Controller {

	@Autowired
	private Bean01Spec bean01Spec;

	@GetMapping("/greeting")
	public String greeting() {
		System.out.println("GreetingController.greeting()");
		System.out.println("[bean01Spec=" + (bean01Spec) + "]");
		return "Ok...";
	}

}
