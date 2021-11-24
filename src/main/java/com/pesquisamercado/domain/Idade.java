package com.pesquisamercado.domain;

import java.time.LocalDate;
import java.time.Period;

public class Idade {
	
	public static int calcularIdade(LocalDate dataNascimento) {

		LocalDate agora = LocalDate.now(); 
		Period periodo = Period.between(dataNascimento, agora); 
		return periodo.getYears(); 
	}

}
