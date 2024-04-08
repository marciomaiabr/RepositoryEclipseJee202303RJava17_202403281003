package pkgs.persistence.repositories.implementations;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import com.mm.models.implementations.Pessoa;

import pkgs.persistence.repositories.specifications.PessoasSpec;

public class PessoasImpl implements Serializable, PessoasSpec {

	private static final long serialVersionUID = 20240328032700L;

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
