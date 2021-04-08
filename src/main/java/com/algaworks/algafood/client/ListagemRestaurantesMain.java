package com.algaworks.algafood.client;

import org.springframework.web.client.RestTemplate;

import com.algaworks.algafood.client.api.RestauranteClient;

public class ListagemRestaurantesMain {

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		RestauranteClient restauranteCliente = new RestauranteClient(restTemplate, "http://api.algafood.local:8080");
		
		restauranteCliente.listar().stream()
			.forEach(restaurante -> System.out.println(restaurante));
	}
	
}