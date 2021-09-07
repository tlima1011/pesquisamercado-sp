package com.pesquisamercado.domain;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Idade {
	
	public static int calcularIdade(Date dataNascimento) {

		int idade = 0;
		Date dataHoje = new Date();
		long diffEmMil = Math.abs(dataHoje.getTime() - dataNascimento.getTime());
		long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);
		idade = (int) (diffEmMil / (1000 * 60 * 60 * 24) / 365);
		return idade;
	}

}
