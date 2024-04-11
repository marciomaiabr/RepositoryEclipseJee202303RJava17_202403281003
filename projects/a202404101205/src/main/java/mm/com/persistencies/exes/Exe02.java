package mm.com.persistencies.exes;

import com.mm.models.PessoaJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import mm.com.persistencies.utils.JPAUtil;

public class Exe02 {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;

		try {
			emf = JPAUtil.criaEntityManagerFactory("PU_NODS_JPA22_202403270735");
			System.out.println("[emf=" + (emf) + "]");

			em = emf.createEntityManager();
			System.out.println("[em=" + (em) + "]");

			et = em.getTransaction();
			System.out.println("[et=" + (et) + "]");

			et.begin();

			PessoaJPA pessoaJPA = em.merge(new PessoaJPA("Ciclano " + java.time.LocalDate.now(), "Reis " + java.time.LocalTime.now()));
			System.out.println("[pessoaJPA=" + (pessoaJPA) + "]");

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
