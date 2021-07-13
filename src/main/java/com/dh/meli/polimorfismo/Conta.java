package com.dh.meli.polimorfismo;

import java.time.LocalDate;

public abstract class Conta {

	private String numero;
	private String agencia;
	private double saldo;
	private static double valorTotalDosSaques; // variavel de classe
	
	private Cliente cliente;
	
	private int quantidadeSaques = 0;
	private LocalDate dataUltimoSaque;
	private ClasseConta classeConta;
	
	public Conta() {

	}
	
	public Conta(String numero, String agencia, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public Conta(String numero, String agencia, double saldo, Cliente cliente, int quantidadeSaques) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
		this.quantidadeSaques = quantidadeSaques;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente clientes) {
		this.cliente = clientes;
	}
	public void deposita(double valor) {
		this.saldo += valor;
	}
	public abstract void saca(double valor);
	
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void upGrade() {
		if(classeConta.equals(ClasseConta.SALARIO)) {
			classeConta = ClasseConta.SIMPLES;
		}else {			
			if(classeConta.equals(ClasseConta.SIMPLES)) {
				classeConta = ClasseConta.SILVER;
			}else {
				if(classeConta.equals(ClasseConta.SILVER)) {
					classeConta = ClasseConta.GOLD;
				}
				else {
					if(classeConta.equals(ClasseConta.GOLD)) {
						classeConta = ClasseConta.PLATINUM;
					}
				}
			}
		}
	}
	public int getQuantidadeSaques() {
		return quantidadeSaques;
	}
	public void incrementaSaque(double valor) {
		this.quantidadeSaques+=1;
		this.dataUltimoSaque = LocalDate.now();
		valorTotalDosSaques += valor;
	}
	
	public static double getValorTotalDeSaques() {
		return valorTotalDosSaques;
	}
	
	@Override
	public String toString() {
		return "\n numero: " + this.numero + "\n agencia: " + this.agencia + "\n saldo: " + this.saldo;
	}
	
	
}
