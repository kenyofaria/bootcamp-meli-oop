package meli.generics;


public class Produto implements Comparable<Produto>{

	private int codigo;
	private String nome;
	
	
	
	public Produto(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}



	public int getCodigo() {
		return codigo;
	}



	public String getNome() {
		return nome;
	}



	@Override
	public int compareTo(Produto o) {
		return nome.compareToIgnoreCase(o.nome);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.codigo + ":" + this.nome;
	}

}
