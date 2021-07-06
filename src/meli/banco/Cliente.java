package meli.banco;

import java.util.Locale;

public class Cliente {

	private String nome;
	private String cpf;
	private char sexo;
	private Locale dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Locale getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Locale dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
