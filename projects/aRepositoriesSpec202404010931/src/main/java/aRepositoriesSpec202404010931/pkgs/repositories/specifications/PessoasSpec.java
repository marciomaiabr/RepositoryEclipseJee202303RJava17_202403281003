package aRepositoriesSpec202404010931.pkgs.repositories.specifications;

import java.util.List;

import pkgs.persistence.models.Pessoa;

public interface PessoasSpec {

	Pessoa save(Pessoa pessoa);
	Pessoa get(Integer id);
	List<Pessoa> list();
	List<Pessoa> listByNome(String nome);
	void delete(Pessoa pessoa);

}
