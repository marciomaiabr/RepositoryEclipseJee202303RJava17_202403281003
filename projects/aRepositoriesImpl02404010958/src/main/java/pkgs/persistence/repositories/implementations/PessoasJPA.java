package pkgs.persistence.repositories.implementations;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.mm.models.implementations.PessoaJPA;

import pkgs.persistence.repositories.specifications.PessoasSpec;

public class PessoasJPA implements Serializable, PessoasSpec<PessoaJPA> {

	private static final long serialVersionUID = 20240328032700L;

	private EntityManager em;

	public PessoasJPA(EntityManager em) {
		this.em = em;
	}

	@Override
	public PessoaJPA save(PessoaJPA pessoa) {
		return em.merge(pessoa);
	}

	@Override
	public PessoaJPA get(Integer id) {
		return em.find(PessoaJPA.class, id);
	}

	@Override
	public List<PessoaJPA> list() {
		return em.createQuery("from Pessoa", PessoaJPA.class).getResultList();
	}

	@Override
	public List<PessoaJPA> listByNome(String nome) {
		return em.createQuery("from Pessoa where nome like :nome% ", PessoaJPA.class).setParameter("nome", nome).getResultList();
	}

	@Override
	public void delete(PessoaJPA pessoa) {
		em.remove(pessoa);
	}

}
