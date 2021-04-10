package com.algaworks.algafood.client.api;

import java.math.BigDecimal;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.algaworks.algafood.client.model.RestauranteModel;
import com.algaworks.algafood.client.model.RestauranteResumoModel;
import com.algaworks.algafood.client.model.input.CidadeInput;
import com.algaworks.algafood.client.model.input.CozinhaInput;
import com.algaworks.algafood.client.model.input.EnderecoInput;
import com.algaworks.algafood.client.model.input.RestauranteInput;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RestauranteClient {

	private static final String RESOURCE_PATH = "/restaurantes";
	
	private RestTemplate restTemplate;
	private String url;
	
	public List<RestauranteResumoModel> listar() {
		try {
			URI resourceUri = URI.create(url + RESOURCE_PATH);
			
			RestauranteResumoModel[] restaurantes = restTemplate
					.getForObject(resourceUri, RestauranteResumoModel[].class);
			
			return Arrays.asList(restaurantes);
		} catch (RestClientResponseException e) {
			throw new ClientApiException(e.getMessage(), e);
		}
	}
	
	public RestauranteModel adicionar() {
		try {
			
			CozinhaInput cozinha = new CozinhaInput();
			//cozinha.setId(1L);
			
			CidadeInput cidade = new CidadeInput();
			cidade.setId(1L);
			
			EnderecoInput endereco = new EnderecoInput();
			endereco.setCep("52041-210");
			endereco.setLogradouro("Rua Inacio Galvao dos Santos");
			endereco.setNumero("196");
			endereco.setBairro("Encruzilhada");
			endereco.setCidade(cidade);
			
			RestauranteInput restaurante = new RestauranteInput();
			restaurante.setNome("");
			restaurante.setTaxaFrete(BigDecimal.ONE);
			restaurante.setCozinha(cozinha);
			restaurante.setEndereco(endereco);
			
			URI resourceUri = URI.create(url + RESOURCE_PATH);
			
			RestauranteModel restauranteCriado = restTemplate
					.postForObject(resourceUri, restaurante, RestauranteModel.class);
			
			return restauranteCriado;
			
		} catch (RestClientResponseException e) {
			throw new ClientApiException(e.getMessage(), e);
		}
	}
	
}
