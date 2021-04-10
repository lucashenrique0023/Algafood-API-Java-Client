package com.algaworks.algafood.client.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoInput {

	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private CidadeInput cidade;
	
}
