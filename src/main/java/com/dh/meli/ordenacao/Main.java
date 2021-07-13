package com.dh.meli.ordenacao;

public class Main {

	
	public static void main(String[] args) {
		
		QuickSortSorterImple instance = (QuickSortSorterImple) MyFactory.getInstance();
		instance.sort(null, null);
		
//		Sorter integerSorter = new QuickSortInteger();
//		
//		Aluno[] alunos = new Aluno[100];
//		
//		Sorter alunoSorter = new QuickSortAluno();
//		
//		
//		integerSorter.sort(new Integer[10], null);
//		alunoSorter.sort(alunos, new Comparator<Aluno>() {
//
//			@Override
//			public int compare(Aluno o1, Aluno o2) {
//				// TODO Auto-generated method stub
//				return o1.getMatricula().compareTo(o2.getMatricula());
//			}
//	
//		});
		
	}
}