package com.mm.cdi.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.mm.beans.implementations.Bean01Spec01Impl;
import com.mm.beans.specifications.Bean01Spec;

@Named
@ViewScoped
public class Teste01Controller implements Serializable {

	private static final long serialVersionUID = 20240328032700L;

	@Autowired
	private Bean01Spec bean01Spec;

	static {
		System.out.println("Teste01Controller.static");
	}

	public Teste01Controller() {
		System.out.println("Teste01Controller.()[" + (this) + "]");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Teste01Controller.postConstruct()[" + (this) + "]");
	}

	public long getSerialversionuid() {
		return serialVersionUID;
	}

	@Bean
	private Bean01Spec criaPessoa() {
		System.out.println("Teste01Controller.criaPessoa()");
		return new Bean01Spec01Impl();
	}

	public void method01() {
		System.out.println("Teste01Controller.method01()[" + (this) + "]");
		System.out.println("[bean01Spec=" + (bean01Spec) + "]");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Teste01Controller.preDestroy()[" + (this) + "]");
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Teste01Controller.finalize()[" + (this) + "]");
		super.finalize();
	}

}
