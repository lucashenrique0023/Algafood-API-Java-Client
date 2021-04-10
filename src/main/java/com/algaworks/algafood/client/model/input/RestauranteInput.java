package com.algaworks.algafood.client.model.input;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestauranteInput {

	private String nome;
	private BigDecimal taxaFrete;
	private CozinhaInput cozinha;
	private EnderecoInput endereco;
	
}
