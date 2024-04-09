package com.mm.utils;

import org.modelmapper.ModelMapper;

import com.mm.dtos.PessoaDTO;
import com.mm.models.implementations.PessoaJPA;
import com.mm.models.specifications.IPessoa;

public class DTOUtil {

	private static ModelMapper modelMapper = new ModelMapper();

	public static PessoaDTO convertIPessoaToPessoaDTO(IPessoa iPessoa) {
		return modelMapper.map(iPessoa, PessoaDTO.class);
	}

	public static IPessoa convertPessoaDTOToIPessoa(PessoaDTO pessoaDTO) {
		return modelMapper.map(pessoaDTO, PessoaJPA.class);
	}

	public static PessoaDTO convertPessoaJPAToPessoaDTO(PessoaJPA pessoaJPA) {
		return modelMapper.map(pessoaJPA, PessoaDTO.class);
	}

	public static PessoaJPA convertPessoaDTOToPessoaJPA(PessoaDTO pessoaDTO) {
		return modelMapper.map(pessoaDTO, PessoaJPA.class);
	}

}
