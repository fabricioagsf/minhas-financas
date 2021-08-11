package com.fagsf.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fagsf.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
