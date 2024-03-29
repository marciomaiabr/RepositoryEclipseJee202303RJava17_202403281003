/*
teste de criação de entidades no banco
*/
package aJPA22_202403270735.pkgs.exes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import aJPA22_202403270735.pkgs.utils.JPAUtil;
import aModelsJPA22_202403290320.pkgs.models.Pessoa;

public class Exe02 {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		Pessoa pessoa = null;

		try {
			emf = JPAUtil.criaEntityManagerFactoryWithCreateCreate();
			System.out.println("[emf=" + (emf) + "]");

			em = emf.createEntityManager();
			System.out.println("[em=" + (em) + "]");

			et = em.getTransaction();
			System.out.println("[et=" + (et) + "]");

			et.begin();

			System.out.println("[pessoa=" + (pessoa) + "]");

			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				et.rollback();
			} catch (Exception e2) {
			}
		} finally {
			try {
				em.close();
			} catch (Exception e2) {
			}
			try {
				emf.close();
			} catch (Exception e2) {
			}
		}

	}

}
