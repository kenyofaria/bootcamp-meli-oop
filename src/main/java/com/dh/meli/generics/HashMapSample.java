package com.dh.meli.generics;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSample {

	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		List<Anuncio> anuncios = Arrays.asList(new Anuncio("XBox", 15),
				new Anuncio("PS 5", 14),
				new Anuncio("iPhone 12", 9),
				new Anuncio("iPhone 11", 7),
				new Anuncio("Galaxy s20", 11),
				new Anuncio("Apple watch", 10),
				new Anuncio("Havaiana numero 36", 6),
				new Anuncio("Bolsa", 99098),
				new Anuncio("Canivete", 1),
				new Anuncio("Dado", 8),
				new Anuncio("Cubo mágico", 100));
		
		
		List<Venda> vendas = Arrays.asList(new Venda(anuncios.get(0), 1, new BigDecimal(5000)),
				new Venda(anuncios.get(0), 1, new BigDecimal(5000)),
				new Venda(anuncios.get(1), 1, new BigDecimal(3000)),
				new Venda(anuncios.get(0), 1, new BigDecimal(5000)),
				new Venda(anuncios.get(1), 1, new BigDecimal(3000)),
				new Venda(anuncios.get(1), 1, new BigDecimal(3000)),
				new Venda(anuncios.get(1), 1, new BigDecimal(3000)),
				new Venda(anuncios.get(1), 1, new BigDecimal(3000)),
				new Venda(anuncios.get(3), 1, new BigDecimal(1000)),
				new Venda(anuncios.get(3), 1, new BigDecimal(1000)),
				new Venda(anuncios.get(3), 1, new BigDecimal(1000)),
				new Venda(anuncios.get(3), 1, new BigDecimal(1000)),
				new Venda(anuncios.get(2), 1, new BigDecimal(10000)),
				new Venda(anuncios.get(2), 1, new BigDecimal(10000)),
				new Venda(anuncios.get(2), 1, new BigDecimal(10000)));
		

		for(Venda v: vendas) {
			Integer valorAtual = map.getOrDefault(v.getAnuncio().getDescricao(), 0);
			valorAtual+=v.getNumeroItens();
			map.put(v.getAnuncio().getDescricao(), valorAtual);
		}
		
		map.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		});
		
		
	}
}
