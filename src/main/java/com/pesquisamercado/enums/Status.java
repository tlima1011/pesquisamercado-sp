package com.pesquisamercado.enums;

public enum Status {

	ATIVO(1, "Ativo"), 
	INATIVO(2, "Inativo"); 
	
	private Integer cod; 
	private String descricao;
	
	private Status(Integer cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	} 
	
	public Status toEnum(Integer cod) { 
		if(cod == null) {
			return null; 
		}
		for(Status x : Status.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id: Inválido: " +cod);
	}		
}
