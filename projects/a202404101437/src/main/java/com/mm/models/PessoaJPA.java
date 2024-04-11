package com.mm.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Pessoa")
@Table(name = "Pessoa")
public class PessoaJPA implements Serializable {

	private static final long serialVersionUID = 20240405131200L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String sobreNome;

	public PessoaJPA() {
		super();
	}

	public PessoaJPA(Integer id, String nome, String sobreNome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public PessoaJPA(String nome, String sobreNome) {
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
		return "PessoaJPA [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaJPA other = (PessoaJPA) obj;
		return Objects.equals(id, other.id);
	}

}
