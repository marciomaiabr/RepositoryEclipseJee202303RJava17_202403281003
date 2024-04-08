package pkgs.persistence.repositories.specifications;

import java.util.List;

import com.mm.models.implementations.Pessoa;

public interface PessoasSpec extends BaseRepository<Pessoa> {

	List<Pessoa> listByNome(String nome);

}
