package meli.generics;

import java.math.BigDecimal;

public class Venda {

	private Anuncio anuncio;
	private int numeroItens;
	private BigDecimal valorTotal;
	
	
	public Venda(Anuncio anuncio, int numeroItens, BigDecimal valorTotal) {
		super();
		this.anuncio = anuncio;
		this.numeroItens = numeroItens;
		this.valorTotal = valorTotal;
	}
	public Anuncio getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}
	public int getNumeroItens() {
		return numeroItens;
	}
	public void setNumeroItens(int numeroItens) {
		this.numeroItens = numeroItens;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
}
