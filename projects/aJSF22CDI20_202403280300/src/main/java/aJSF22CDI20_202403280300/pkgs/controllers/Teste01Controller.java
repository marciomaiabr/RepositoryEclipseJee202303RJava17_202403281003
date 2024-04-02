package aJSF22CDI20_202403280300.pkgs.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;
import pkgs.persistence.models.Pessoa;

@Named
@ViewScoped
public class Teste01Controller implements Serializable {

	private static final long serialVersionUID = 20240328032700L;

	private Pessoa pessoa;
	@Inject
	private PessoasServiceSpec pessoas;

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

	public void method01() {
		System.out.println("Teste01Controller.method01()[" + (this) + "]");
		System.out.println("[pessoas=" + (pessoas) + "]");
		System.out.println("[pessoa=" + (pessoa) + "]");
		pessoas.listar().forEach(System.out::println);
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
