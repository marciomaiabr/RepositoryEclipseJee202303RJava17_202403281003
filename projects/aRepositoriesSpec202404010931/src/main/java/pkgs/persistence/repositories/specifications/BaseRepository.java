package pkgs.persistence.repositories.specifications;

import java.util.List;

import pkgs.persistence.models.Pessoa;

public interface BaseRepository {

	Pessoa save(Pessoa pessoa);
	Pessoa get(Integer id);
	List<Pessoa> list();
	void delete(Pessoa pessoa);

}
