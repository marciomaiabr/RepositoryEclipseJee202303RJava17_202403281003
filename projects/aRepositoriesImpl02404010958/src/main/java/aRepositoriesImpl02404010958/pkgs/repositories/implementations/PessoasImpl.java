package aRepositoriesImpl02404010958.pkgs.repositories.implementations;

import java.util.List;

import javax.persistence.EntityManager;

import aModelsJPA22_202403290320.pkgs.models.Pessoa;
import aRepositoriesSpec202404010931.pkgs.repositories.specifications.PessoasSpec;

public class PessoasImpl implements PessoasSpec {

	private EntityManager em;

	public PessoasImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public Pessoa save(Pessoa pessoa) {
		return em.merge(pessoa);
	}

	@Override
	public Pessoa get(Integer id) {
		return em.find(Pessoa.class, id);
	}

	@Override
	public List<Pessoa> list() {
		return em.createQuery("from Pessoa", Pessoa.class).getResultList();
	}

	@Override
	public List<Pessoa> listByNome(String nome) {
		return em.createQuery("from Pessoa where nome like :nome% ", Pessoa.class).setParameter("nome", nome).getResultList();
	}

	@Override
	public void delete(Pessoa pessoa) {
		em.remove(pessoa);
	}

}