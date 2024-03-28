package aJPA22_202403270735.pkgs.utils;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final String url = "jdbc:mysql://127.0.0.1:3306/scma_jpa22_202403270735";
	private static final String username = "java";
	private static final String password = "java";

	public static EntityManagerFactory criaEntityManagerFactoryWithCreateNone() {
		EntityManagerFactory emf = null;

		Map<String, String> map = new HashMap<String, String>();
		map.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		map.put("javax.persistence.jdbc.url", url);
		map.put("javax.persistence.jdbc.user", username);
		map.put("javax.persistence.jdbc.password", password);
		map.put("javax.persistence.jdbc.driver", "com.mysql.cj.jdbc.Driver");
		map.put("hibernate.show_sql", "true");
		map.put("hibernate.format_sql", "true");
		map.put("use_sql_comments", "true");
		map.put("hibernate.hbm2ddl.auto", "none");
		map.put("hibernate.archive.autodetection", "class");
		emf = Persistence.createEntityManagerFactory("PU_JPA22_202403270735", map);

		return emf;
	}

}
