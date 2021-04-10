package com.algaworks.algafood.client.model;

import java.time.OffsetDateTime;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Problem {

	private Integer Status;
	private OffsetDateTime timestamp;
	private String userMessage;
	List<Fields> fields;
	
	@Getter
	@Setter
	public static class Fields {
		
		private String name;
		private String userMessage;
		
	}
}
