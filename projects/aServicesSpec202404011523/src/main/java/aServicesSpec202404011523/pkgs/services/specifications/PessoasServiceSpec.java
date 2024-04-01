package aServicesSpec202404011523.pkgs.services.specifications;

import java.util.List;

import aModelsJPA22_202403290320.pkgs.models.Pessoa;

public interface PessoasServiceSpec {

	Pessoa salvar(Pessoa pessoa);
	Pessoa buscar(Integer id);
	List<Pessoa> listar();
	List<Pessoa> listarPorNome(String nome);
	void excluir(Pessoa pessoa);

}
