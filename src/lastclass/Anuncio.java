package lastclass;

public class Anuncio implements Comparable<Anuncio>{

	private String codigo;
	private String nome;
	private int totalVendas;
	
	public Anuncio() {
		
	}
	
	public Anuncio(String codigo, String nome, int totalVendas) {
		this.codigo = codigo;
		this.nome = nome;
		this.totalVendas = totalVendas;
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public int compareTo(Anuncio a) {
		return this.nome.toLowerCase().compareTo(a.getNome().toLowerCase());
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
