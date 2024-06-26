package com.mm.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mm.beans.specifications.Bean01Spec;

@Controller
public class Teste01Controller {

	@Autowired
	private Bean01Spec bean01Spec;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		System.out.println("Teste01Controller.greeting()");
		System.out.println("[bean01Spec=" + (bean01Spec) + "]");
		// System.out.println("[bean01Spec.getNome()=" + (bean01Spec.getNome()) + "]");
		model.addAttribute("name", name);
		return "greeting";
	}

}
