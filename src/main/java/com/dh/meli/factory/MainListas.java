package com.dh.meli.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainListas {

	
	public static void main(String[] args) {
		List<Anuncio> anuncios = new ArrayList<>();
		anuncios.add(new Anuncio("MLB9000", "XBOX One", 25000));
		anuncios.add(new Anuncio("MLB3061", "porta do mercedes c200 2014", 400));
		anuncios.add(new Anuncio("MLB9010", "PS5", 20000));
		anuncios.add(new Anuncio("MLB3070", "porta do mercedes c180 2014", 100));

		List<Anuncio> v = anuncios.parallelStream()
			.filter(a -> a.getTotalVendas() < 1000)
			.collect(Collectors.toList());
		
		Optional<List<Anuncio>> o = Optional.of(v);
		o.ifPresent(a -> a.forEach(System.out::println));
		
		
		//Anuncio.getNome()
		//Anuncio::getNome
		//retorno.forEach(System.out::println);
		
//		System.out.println("\n---------- ordem de insercao");
//		anuncios.forEach(a -> System.out.println(a.getNome()));
//		
//		System.out.println("\n---------- ordem de insercao");
//		anuncios.forEach(System.out::println);
		
//		System.out.println("\n---------- ordem padrao");
//		anuncios.sort(null);
//		anuncios.forEach(a -> System.out.println(a.getNome()));
//		
//		System.out.println("\n---------- ordem de codigo");
//		anuncios.sort(Comparator.comparing(Anuncio::getCodigo));
//		anuncios.forEach(a -> System.out.println(a.getNome()));
	}
}
