package meli.banco.listas;

public class Aluno implements Comparable<Aluno>{

	private int matricula;
	private String nome;
	
	public Aluno(int matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return this.nome.equals(a.nome);
	}
	
	@Override
	public String toString() {
		return "matricula: " + this.matricula + ", nome: " + this.nome;
	}

	@Override
	public int compareTo(Aluno a) {
		return this.nome.compareTo(a.getNome()); //-1   0   1
	}
}
