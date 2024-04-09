package aServicesImpl202404011548.pkgs.services.implementations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.mm.dtos.PessoaDTO;
import com.mm.utils.DTOUtil;

import aServicesSpec202404011523.pkgs.services.specifications.PessoasServiceSpec;
import pkgs.persistence.repositories.implementations.PessoasJPA;

public class PessoasServiceImpl implements Serializable, PessoasServiceSpec {

	private static final long serialVersionUID = 20240328032700L;

	@Inject
	private PessoasJPA pessoas;

	@Override
	public PessoaDTO salvar(PessoaDTO pessoa) {
		return DTOUtil.convertPessoaJPAToPessoaDTO(pessoas.save(DTOUtil.convertPessoaDTOToPessoaJPA(pessoa)));
	}

	@Override
	public PessoaDTO buscar(Integer id) {
		return DTOUtil.convertPessoaJPAToPessoaDTO(pessoas.get(id));
	}

	@Override
	public List<PessoaDTO> listar() {
		List<PessoaDTO> list = new ArrayList<>();
		pessoas.list().forEach(iPessoa -> list.add(DTOUtil.convertPessoaJPAToPessoaDTO(iPessoa)));
		return list;
	}

	@Override
	public void excluir(PessoaDTO pessoa) {
		pessoas.delete(DTOUtil.convertPessoaDTOToPessoaJPA(pessoa));
	}

}
