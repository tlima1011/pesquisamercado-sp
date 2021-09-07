package com.pesquisamercado.enums;

public enum Instrucao {
	
	ANALFABETO_FUNDAMENTAL_I_INCOMPLETO(1, "Analfabeto / Fundamental I Incompleto"),
	FUNDAMENTAL_I_COMPLETO_FUNDAMENTAL_II_COMPLETO(2, "Fundamental I completo / Fundamental II incompleto"),
	FUNDAMENTAL_II_COMPLETO_MEDIO_INCOMPLETO(3, "Fundamental_II_completo / Medio incompleto") , 
	MEDIO_COMPLETO_SUPERIOR_INCOMPLETO(4, "Medio completo / Superior incompleto"), 
	SUPERIOR_COMPLETO(5, "Superior Completo");
	
	private Integer cod; 
	private String descricao;
		
	private Instrucao(int Integer, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	} 
	
	public Instrucao toEnum(Integer cod) {
		if(cod == null) {
			return null; 
		}
		for(Instrucao x : Instrucao.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id: Invalido: " +cod);
	}

}
