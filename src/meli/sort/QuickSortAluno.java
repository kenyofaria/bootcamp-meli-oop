package meli.sort;

import java.util.Comparator;

public class QuickSortAluno implements Sorter<Aluno>{

	private Comparator<Aluno> comparator;

	@Override
	public void sort(Aluno[] array, Comparator<Aluno> comparator) {
		this.comparator = comparator;
	}
	

}
