package aServicesImpl202404011548.pkgs.services.implementations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.mm.dtos.PessoaDTO;
import com.mm.models.specifications.IPessoa;
import com.mm.utils.DTOUtil;

import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;
import pkgs.persistence.repositories.specifications.PessoasSpec;

public class PessoasServiceImpl implements Serializable, PessoasServiceSpec {

	private static final long serialVersionUID = 20240328032700L;

	@Inject
	private PessoasSpec<IPessoa> pessoas;

	@Override
	public PessoaDTO salvar(PessoaDTO pessoa) {
		return DTOUtil.convertIPessoaToPessoaDTO(pessoas.save(DTOUtil.convertPessoaDTOToIPessoa(pessoa)));
	}

	@Override
	public PessoaDTO buscar(Integer id) {
		return DTOUtil.convertIPessoaToPessoaDTO(pessoas.get(id));
	}

	@Override
	public List<PessoaDTO> listar() {
		List<PessoaDTO> list = new ArrayList<>();
		pessoas.list().forEach(iPessoa -> list.add(DTOUtil.convertIPessoaToPessoaDTO(iPessoa)));
		return list;
	}

	@Override
	public void excluir(PessoaDTO pessoa) {
		pessoas.delete(DTOUtil.convertPessoaDTOToIPessoa(pessoa));
	}

}
