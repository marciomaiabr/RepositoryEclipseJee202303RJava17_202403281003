package aSpringRepository_202404051423.com.mm.exes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

import com.mm.models.implementations.Pessoa;
import com.mm.models.repositories.IPessoaSpringRepository;
import com.mm.models.specifications.IPessoa;

import aJPA22_202403270735.pkgs.utils.JPAUtil;

public class Exe01 {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Ciclano " + java.time.LocalDate.now(), "Reis " + java.time.LocalTime.now());

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

			JpaRepositoryFactory jpaRepositoryFactory = new JpaRepositoryFactory(em);
			System.out.println("[jpaRepositoryFactory=" + (jpaRepositoryFactory) + "]");

			IPessoaSpringRepository pessoaSpringRepository = jpaRepositoryFactory.getRepository(IPessoaSpringRepository.class);
			System.out.println("[pessoaSpringRepository=" + (pessoaSpringRepository) + "]");

			Pessoa pessoa2 = pessoaSpringRepository.save(pessoa);
			System.out.println("[pessoa2=" + (pessoa2) + "]");

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
