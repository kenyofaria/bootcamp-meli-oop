package meli.banco.conta;

public class ContaSimples extends Conta implements TransferenciaService{

	
	private static final double TAXA_SAQUE = 0.1;

	@Override
	public void saca(double valor) {
		double saldo = super.getSaldo();
		if(valor<=(saldo+TAXA_SAQUE)) {
			saldo -= valor+TAXA_SAQUE;
			super.setSaldo(saldo);
			super.incrementaSaque(valor);
		}else {
			throw new RuntimeException("saldo insuficiente");
		}
	}

	@Override
	public void transferencia(TransferenciaService destino, double valor) {
		System.out.println("executando transferencia conta simples");
	}
}
