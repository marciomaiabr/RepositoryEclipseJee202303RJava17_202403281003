package mm.com.persistencies.utils;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory criaEntityManagerFactory(String persistenceUnitName) {
		EntityManagerFactory emf = null;

		emf = Persistence.createEntityManagerFactory(persistenceUnitName);

		return emf;
	}

}
