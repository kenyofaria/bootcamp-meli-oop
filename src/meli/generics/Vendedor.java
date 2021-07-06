package meli.generics;

public class Vendedor implements Comparable<Vendedor>{

	private String nome;
	private int idade;
	private int numeroVendas;
	
	public Vendedor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Vendedor(String nome, int idade, int numeroVendas) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.numeroVendas = numeroVendas;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumeroVendas() {
		return numeroVendas;
	}
	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	@Override
	public int compareTo(Vendedor o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + ":" + this.idade + ":" + this.numeroVendas;
	}
	
}
