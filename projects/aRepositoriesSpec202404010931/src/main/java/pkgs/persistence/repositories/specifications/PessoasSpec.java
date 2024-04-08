package pkgs.persistence.repositories.specifications;

import java.util.List;

public interface PessoasSpec<T> extends BaseRepository<T> {

	List<T> listByNome(String nome);

}
