package com.dh.meli.solid;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoValorAumento implements ValidacaoAumento{

	public void validar(Funcionario funcionario, BigDecimal valor) {
		BigDecimal percentualReajuste = valor.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
		if(percentualReajuste.compareTo(new BigDecimal(0.2))>0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salário");
		}
	}
}
