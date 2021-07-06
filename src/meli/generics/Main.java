package meli.generics;

import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Integer[] vetor = {15,14,9,7,11,10,2,4,3,1,12,13,8,5,6};
		Anuncio[] anuncios = {new Anuncio("", 15),
				new Anuncio("", 14),
				new Anuncio("", 9),
				new Anuncio("", 7),
				new Anuncio("", 11),
				new Anuncio("", 10),
				new Anuncio("", 2),
				new Anuncio("", 4),
				new Anuncio("", 3),
				new Anuncio("", 1),
				new Anuncio("", 12),
				new Anuncio("", 13),
				new Anuncio("", 8),
				new Anuncio("", 5),
				new Anuncio("", 6)};
		
		
//		QuickSortSorterImple<Integer> sorter = new QuickSortSorterImple<Integer>();
//		sorter.sort(vetor, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}
//		});
		
		QuickSortSorterImple<Anuncio> sorter = new QuickSortSorterImple<Anuncio>();
		sorter.sort(anuncios, new Comparator<Anuncio>() {
			@Override
			public int compare(Anuncio o1, Anuncio o2) {
				return Integer.compare(o1.getNumeroVendas(), o2.getNumeroVendas());
			}
			
		});
		
	}
}
