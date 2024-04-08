package aServicesSpec202404011523.pkgs.services.specifications;

import java.util.List;

import com.mm.models.implementations.Pessoa;

public interface PessoasServiceSpec {

	Pessoa salvar(Pessoa pessoa);
	Pessoa buscar(Integer id);
	List<Pessoa> listar();
	void excluir(Pessoa pessoa);

}
