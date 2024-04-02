package aServicesImpl202404011548.pkgs.producers;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import aJPA22_202403270735.pkgs.utils.JPAUtil;

@ApplicationScoped
public class EntityManagerProducer implements Serializable {

	private static final long serialVersionUID = 20240328032700L;

	private EntityManagerFactory entityManagerFactory;

	public EntityManagerProducer() {
		System.out.println("EntityManagerProducer.()");
		entityManagerFactory = JPAUtil.criaEntityManagerFactory();
	}

	@Produces
	@RequestScoped
	public EntityManager createEntityManager() {
		System.out.println("EntityManagerProducer.createEntityManager()");
		return entityManagerFactory.createEntityManager();
	}

	public void closeEntityManager(@Disposes EntityManager manager) {
		System.out.println("EntityManagerProducer.closeEntityManager()");
		manager.close();
	}

}
