package com.algaworks.algafood.client.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class RestauranteResumoModel {

	private Long id;
	private String nome;
	private BigDecimal frete;
	private CozinhaModel cozinha;
	
}
