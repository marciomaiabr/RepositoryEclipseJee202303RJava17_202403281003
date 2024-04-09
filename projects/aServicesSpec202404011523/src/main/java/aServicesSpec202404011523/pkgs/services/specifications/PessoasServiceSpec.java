package aServicesSpec202404011523.pkgs.services.specifications;

import java.util.List;

import com.mm.dtos.PessoaDTO;

public interface PessoasServiceSpec {

	PessoaDTO salvar(PessoaDTO pessoa);
	PessoaDTO buscar(Integer id);
	List<PessoaDTO> listar();
	void excluir(PessoaDTO pessoa);

}
