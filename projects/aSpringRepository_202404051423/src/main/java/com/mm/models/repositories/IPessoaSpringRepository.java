package com.mm.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.models.implementations.Pessoa;

public interface IPessoaSpringRepository extends JpaRepository<Pessoa, Integer> {

}
