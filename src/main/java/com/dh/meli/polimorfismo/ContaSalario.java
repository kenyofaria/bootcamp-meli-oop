package com.dh.meli.polimorfismo;


public class ContaSalario extends Conta{

	
	public ContaSalario(String numero, String agencia, double saldo) {
		super(numero, agencia, saldo);
	}
	
	@Override
	public void saca(double valor) {
		double saldo = super.getSaldo();
		if(valor<=(saldo)) {
			saldo -= valor;
			super.setSaldo(saldo);
			super.incrementaSaque(valor);
		}else {
			throw new RuntimeException("saldo insuficiente");
		}
	}
	

}
