package jao.vitor;

public class Socorrista<V extends Veiculo> {

	public void socorre(V veiculo) {
		System.out.println("socorrendo: " + veiculo.getPlaca());
	}
}
