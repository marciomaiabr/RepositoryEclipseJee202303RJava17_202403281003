package aServicesImpl202404011548.pkgs.services.implementations;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.mm.models.implementations.Pessoa;

import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;
import pkgs.persistence.repositories.specifications.PessoasSpec;

public class PessoasServiceImpl implements Serializable, PessoasServiceSpec {

	private static final long serialVersionUID = 20240328032700L;

	@Inject
	private PessoasSpec pessoas;

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return pessoas.save(pessoa);
	}

	@Override
	public Pessoa buscar(Integer id) {
		return pessoas.get(id);
	}

	@Override
	public List<Pessoa> listar() {
		return pessoas.list();
	}

	@Override
	public void excluir(Pessoa pessoa) {
		pessoas.delete(pessoa);
	}

}
