package meli.banco;

public class ExemploTipo {
	
	public static void main(String[] args) {
//		String a = new String("");
//		String b = new String("");
//		
//		
//		
//		System.out.println(System.identityHashCode(a));
//		System.out.println(System.identityHashCode(b));
		
		
		
		String p = "p";
		String q = p;
		
		if(p==q) {
			System.out.println("sao iguais");
		}
		
		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(q));
		
	}
}
