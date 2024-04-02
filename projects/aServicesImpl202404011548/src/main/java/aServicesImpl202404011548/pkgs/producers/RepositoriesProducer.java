package aServicesImpl202404011548.pkgs.producers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import pkgs.persistence.repositories.implementations.PessoasImpl;
import pkgs.persistence.repositories.specifications.PessoasSpec;

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
