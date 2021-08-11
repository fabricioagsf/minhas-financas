package com.fagsf.minhasfinancas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
//anotação de entidade
@Entity
//identificação de tabela
@Table(name="usuario", schema = "financas")
@Data
@Builder
public class Usuario {
	//identificação de chave primaria
	@Id
	//identificação de coluna
	@Column(name = "id")
	//definição de auto incremeto feito pelo banco
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "senha")
	private String senha;

}
