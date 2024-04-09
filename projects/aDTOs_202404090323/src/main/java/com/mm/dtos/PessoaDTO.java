package com.mm.dtos;

import java.io.Serializable;

public class PessoaDTO implements Serializable {

	private static final long serialVersionUID = 20240405131200L;

	private Integer id;
	private String nome;
	private String sobreNome;

	public PessoaDTO() {
		super();
	}

	public PessoaDTO(Integer id, String nome, String sobreNome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public PessoaDTO(String nome, String sobreNome) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	@Override
	public String toString() {
		return "PessoaDTO [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + "]";
	}

}
