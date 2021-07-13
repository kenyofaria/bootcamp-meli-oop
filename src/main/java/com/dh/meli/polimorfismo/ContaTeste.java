package com.dh.meli.polimorfismo;

public class ContaTeste {

	public static void main(String[] args) {
		Conta cs1 = new ContaSalario("12345-5", "890", 100);
		Conta cs2 = new ContaSalario("87382-5", "890", 1000);
		
		System.out.println("------------- conta salario inicial c1 -------------------");
		System.out.println(cs1);
		
		System.out.println("------------- conta salario inicial c2 -------------------");
		System.out.println(cs2);
		
	
		cs1.deposita(5000);
		cs2.deposita(400);
		
		System.out.println("------------- conta salario apos deposito c1 -------------------");
		System.out.println(cs1);
		
		System.out.println("------------- conta salario apos deposito c2 -------------------");
		System.out.println(cs2);
		
		cs1.saca(500);
		cs1.saca(200);
		cs2.saca(50);
		
		System.out.println("------------- conta salario apos saques c1 -------------------");
		System.out.println(cs1);
		
		System.out.println("------------- conta salario apos saques c2 -------------------");
		System.out.println(cs2);
		
		System.out.println("------------- total saques todas as contas -------------------");
//		System.out.println(cs1.getValorTotalDeSaques());
//		System.out.println(cs2.getValorTotalDeSaques());
		
		System.out.println(Conta.getValorTotalDeSaques());
		
		//ContaSilver contaSilver = new ContaSilver("37367-9", "890", 1000);
		
	}
}
