package com.mm.cdi.controllers;

import java.io.Serializable;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named
@ViewScoped
public class Teste02Controller implements Serializable {

	private static final long serialVersionUID = 20240328032700L;
	
	private String stringTeste02Controller;

	static {
		System.out.println("Teste02Controller.static");
	}

	public Teste02Controller() {
		System.out.println("Teste02Controller.()[" + (this) + "]");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste02Controller.postConstruct()[" + (this) + "]");
	}

	public long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStringTeste02Controller() {
		return stringTeste02Controller;
	}

	public void setStringTeste02Controller(String stringTeste02Controller) {
		this.stringTeste02Controller = stringTeste02Controller;
	}

	public void method01() {
		System.out.println("Teste02Controller.method01()[" + (this) + "]");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste02Controller.preDestroy()[" + (this) + "]");
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Teste02Controller.finalize()[" + (this) + "]");
		super.finalize();
	}

}
