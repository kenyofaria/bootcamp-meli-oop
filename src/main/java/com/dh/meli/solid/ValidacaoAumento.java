package com.dh.meli.solid;

import java.math.BigDecimal;

public interface ValidacaoAumento {

	void validar(Funcionario funcionario, BigDecimal valor);
}
