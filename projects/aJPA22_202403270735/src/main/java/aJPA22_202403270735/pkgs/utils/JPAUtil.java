package aJPA22_202403270735.pkgs.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory criaEntityManagerFactory() {
		EntityManagerFactory emf = null;

		emf = Persistence.createEntityManagerFactory("PU_JPA22_202403270735");

		return emf;
	}

}
