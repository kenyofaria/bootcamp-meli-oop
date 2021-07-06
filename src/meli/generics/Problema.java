package meli.generics;

import java.util.Arrays;
import java.util.List;

public class Problema {

	public static void main(String[] args) {
		List<Produto> produtos = Arrays.asList(new Produto(1, "pincel"), 
				new Produto(2, "Makita"),
				new Produto(3, "escada 13 degraus"));
		
		produtos.sort((p1,p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo()));
		
		System.out.println(Arrays.toString(produtos.toArray()));
	
//		Anuncio[] anuncios = {new Anuncio("XBox", 15),
//				new Anuncio("PS 5", 14),
//				new Anuncio("iPhone 12", 9),
//				new Anuncio("iPhone 11", 7),
//				new Anuncio("Galaxy s20", 11),
//				new Anuncio("Apple watch", 10),
//				new Anuncio("Havaiana numero 36", 6),
//				new Anuncio("Bolsa", 99098),
//				new Anuncio("Canivete", 1),
//				new Anuncio("Dado", 8),
//				new Anuncio("Cubo mágico", 100)};
//		
//		Vendedor[] vendedores = {new Vendedor("Luiz", 20, 10000), 
//				new Vendedor("Andre", 21, 7500), 
//				new Vendedor("Murilo", 23, 6800),
//				new Vendedor("Wincenty", 25, 7750),
//				new Vendedor("Adriana", 19, 22000),
//				new Vendedor("Pablo", 25, 2000),
//				new Vendedor("Carlos", 28, 100),
//				new Vendedor("Renan", 30, 25000)};
//		
//		Sorter<Vendedor> quickVendedor = new QuickSortSorterImple<Vendedor>();
//		quickVendedor.sort(vendedores, (p1, p2) -> Integer.compare(p1.getNumeroVendas(), p2.getNumeroVendas()));
		
//		Sorter<Anuncio> quick = new QuickSortSorterImple<Anuncio>();
//		quick.sort(anuncios, (o1, o2) -> Integer.compare(o1.getNumeroVendas(), o2.getNumeroVendas()));
	}
	
}
