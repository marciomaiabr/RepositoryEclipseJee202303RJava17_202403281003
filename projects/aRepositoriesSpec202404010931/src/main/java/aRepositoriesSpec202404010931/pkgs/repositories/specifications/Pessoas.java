package aRepositoriesSpec202404010931.pkgs.repositories.specifications;

import java.util.List;

import aModelsJPA22_202403290320.pkgs.models.Pessoa;

public interface Pessoas {

	Pessoa save(Pessoa pessoa);
	Pessoa get(Integer id);
	List<Pessoa> list();
	List<Pessoa> listByNome(String nome);
	void delete(Pessoa pessoa);

}