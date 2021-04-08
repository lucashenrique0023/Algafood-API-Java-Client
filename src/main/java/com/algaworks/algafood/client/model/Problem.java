package com.algaworks.algafood.client.model;

import java.time.OffsetDateTime;

import lombok.Data;

@Data
public class Problem {

	private Integer Status;
	private OffsetDateTime timestamp;
	private String userMessage;
	
}
