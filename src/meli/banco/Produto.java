package meli.banco;

public class Produto {

	private String codigo;
	private String nome;
	private double preco;
	
	public Produto(String codigo, String nome, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}	

	public Produto(){
		
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto clone(Produto produto) {
		Produto p = new Produto(produto.codigo, produto.nome, produto.preco);		
		return p;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getName() + "[codigo: " + this.codigo + " -- nome: " + this.nome + " -- preco: " + this.preco + "]";
	}
	
	
	
	
	
	
	
}
