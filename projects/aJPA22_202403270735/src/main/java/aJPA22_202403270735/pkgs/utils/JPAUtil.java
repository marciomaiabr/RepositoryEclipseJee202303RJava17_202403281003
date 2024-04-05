package aJPA22_202403270735.pkgs.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory criaEntityManagerFactory(String persistenceUnitName) {
		EntityManagerFactory emf = null;

		emf = Persistence.createEntityManagerFactory(persistenceUnitName);

		return emf;
	}

}
