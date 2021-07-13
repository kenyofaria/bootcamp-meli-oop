package com.dh.meli.lista;

import java.util.List;
import java.util.Vector;

public class Main {

	
	public static void main(String[] args) {
		List<Aluno> alunos = new Vector<Aluno>();
		alunos.add(new Aluno(12, "kenyo"));
		alunos.add(new Aluno(13, "yuri"));
		alunos.add(new Aluno(14, "pedro"));
		alunos.add(new Aluno(15, "wincenty"));
		alunos.add(new Aluno(16, "luiz"));
		alunos.add(new Aluno(17, "vitor"));
		alunos.add(new Aluno(18, "larissa"));
		alunos.add(new Aluno(19, "marina"));
		alunos.add(new Aluno(20, "marcelo"));
		alunos.add(new Aluno(21, "renan"));
		alunos.add(new Aluno(22, "joao"));
		
		System.out.println("\n\n ------------------ lista original --------------");
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("\n\n ------------------ lista ordenada por nome --------------");
		alunos.sort(null);
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("\n\n ------------------ lista ordenada por matricula --------------");
		alunos.sort((Aluno a1, Aluno a2) -> Integer.compare(a1.getMatricula(), a2.getMatricula()));
		
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
	
}
