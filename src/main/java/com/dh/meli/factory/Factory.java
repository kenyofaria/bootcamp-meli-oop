package com.dh.meli.factory;

public class Factory {

	
	public static Pessoa getInstance(String clazz, String nome) {
		if(clazz.toLowerCase().equals("aluno")) {
			return new Aluno(nome);
		}
		if(clazz.toLowerCase().equals("professor")) {
			return new Professor(nome);
		}
		throw new RuntimeException("especifique o tipo de instancia");
	}
	
	public static Pessoa getInstance(TipoPessoa tipo, String nome) {
		if(tipo.equals(TipoPessoa.ALUNO)) {
			return new Aluno(nome);
		}
		if(tipo.equals(TipoPessoa.PROFESSOR)) {
			return new Professor(nome);
		}
		throw new RuntimeException("especifique o tipo de instancia");
	}
	
	public static Pessoa getInstance(TipoPessoa tipo, String nome, String sexo) {
		if(tipo.equals(TipoPessoa.ALUNO)) {
			return new Aluno(nome);
		}
		if(tipo.equals(TipoPessoa.PROFESSOR)) {
			return new Professor(nome);
		}
		throw new RuntimeException("especifique o tipo de instancia");
	}
}
