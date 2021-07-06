package meli.generics;

public class Anuncio implements Comparable<Anuncio>{	
	private String descricao;
	private int numeroVendas;
	
	public Anuncio(String descricao, int numeroVendas) {
		super();
		this.descricao = descricao;
		this.numeroVendas = numeroVendas;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNumeroVendas() {
		return numeroVendas;
	}
	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
	@Override
	public int compareTo(Anuncio o) {
		return this.descricao.toLowerCase().compareTo(o.descricao.toLowerCase());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.descricao;
		//return String.valueOf(this.getNumeroVendas());
	}
	
}
