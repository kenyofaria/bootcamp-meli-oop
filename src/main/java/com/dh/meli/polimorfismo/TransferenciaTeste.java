package com.dh.meli.polimorfismo;


public class TransferenciaTeste {

	public static void main(String[] args) {
		ContaSilver silver = new ContaSilver("34243-6", "86", 10000);
		
		silver.transferencia(new ContaSilver("345345", "50", 10), 100);
		
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Wincenty");
		ContaSilver contaSilver = new ContaSilver("", "", 1000000000, cliente);
		
	}
}
