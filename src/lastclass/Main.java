package lastclass;

public class Main {

	
	public static void main(String[] args) {

		Pessoa aluno = Factory.getInstance("aluno", "kenyo");
		Pessoa professor = Factory.getInstance("professor", "yuri");
		
		Pessoa joao = Factory.getInstance(TipoPessoa.ALUNO, "joao");
		
		System.out.println(aluno.getNome());
		System.out.println(professor.getNome());
		System.out.println(joao.getNome());
	}
}
