package aJSF22CDI20_202403280300.pkgs.producers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import aRepositoriesImpl02404010958.pkgs.repositories.implementations.PessoasImpl;
import aRepositoriesSpec202404010931.pkgs.repositories.specifications.PessoasSpec;

@RequestScoped
public class RepositoriesProducer implements Serializable {

	private static final long serialVersionUID = 20240328032700L;

	@Inject
	EntityManager entityManager;

	public RepositoriesProducer() {
		System.out.println("RepositoriesProducer.()");
	}

	@Produces
	public PessoasSpec createPessoasSpec() {
		return new PessoasImpl(entityManager);
	}

}
