package com.dh.meli.polimorfismo;

public class ContaSilver extends Conta implements TransferenciaService{

	
	private static final double TAXA_SAQUE = 0.15;
	private double limite;
	
	public ContaSilver(String numero, String agencia, double saldo) {
		super(numero, agencia, saldo);
		this.limite = saldo * 0.05;
	}
	
	public ContaSilver(String numero, String agencia, double saldo, Cliente cliente) {
		super(numero, agencia, saldo, cliente, 10);
		this.limite = saldo * 0.05;
	}
	
	@Override
	public void saca(double valor) {
		double saldo = super.getSaldo();
		double limite = this.limite;
		if(valor<=(saldo+limite+TAXA_SAQUE)) {
			saldo -= valor+TAXA_SAQUE;
			super.setSaldo(saldo);
			super.incrementaSaque(valor);
		}else {
			throw new RuntimeException("saldo insuficiente");
		}
	}

	@Override
	public void transferencia(TransferenciaService destino, double valor) {
		System.out.println("executando transferencia conta silver");
	}
}
