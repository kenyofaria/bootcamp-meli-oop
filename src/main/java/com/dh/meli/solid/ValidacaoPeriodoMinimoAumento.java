package com.dh.meli.solid;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodoMinimoAumento implements ValidacaoAumento{

	public void validar(Funcionario funcionario, BigDecimal valor) {
		LocalDate dataEntrada = funcionario.getDataEntrada();
		LocalDate dataAtual = LocalDate.now();
		long meses = ChronoUnit.MONTHS.between(dataEntrada, dataAtual);
		if(meses <= 3) {
			throw new ValidacaoException("Reajuste nao pode ser aplicado a pessoas com menos de 4 meses de casa");
		}
	}
}
