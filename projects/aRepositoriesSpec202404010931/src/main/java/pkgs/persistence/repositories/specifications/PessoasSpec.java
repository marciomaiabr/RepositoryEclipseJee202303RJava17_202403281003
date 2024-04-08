package pkgs.persistence.repositories.specifications;

import java.util.List;

import com.mm.models.specifications.IPessoa;

public interface PessoasSpec extends BaseRepository<IPessoa> {

	List<IPessoa> listByNome(String nome);

}
