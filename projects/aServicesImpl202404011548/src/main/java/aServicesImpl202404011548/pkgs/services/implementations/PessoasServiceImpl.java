package aServicesImpl202404011548.pkgs.services.implementations;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import aModelsJPA22_202403290320.pkgs.models.Pessoa;
import aRepositoriesSpec202404010931.pkgs.repositories.specifications.PessoasSpec;
import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;

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
	public List<Pessoa> listarPorNome(String nome) {
		return pessoas.listByNome(nome);
	}

	@Override
	public void excluir(Pessoa pessoa) {
		pessoas.delete(pessoa);
	}

}
