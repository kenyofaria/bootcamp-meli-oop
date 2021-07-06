package meli.precedente;

public class Pessoa implements Precedente<Pessoa>{

	private String nome;
	
	
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}



	@Override
	public int precedeA(Pessoa t) {
		return this.nome.compareToIgnoreCase(t.nome);
	}

	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
}
