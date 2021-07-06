package meli.precedente;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortUtil {

//	public static <T> Pessoa sort(Precedente <T> arr[]){
//		return null;
//	}

	
	public static <T> void sort(Precedente<T> arr[]) {
		bubbleSort(arr);
	}

	private static void bubbleSort(Precedente[] arr) {
		int n = arr.length;
		IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
			int result = arr[j - 1].precedeA(arr[j]);
			if (result >= 0) {
				Precedente temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		});
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Precedente[] array = { new Pessoa("Larissa"), new Pessoa("Pedro"), new Pessoa("kenyo"), new Pessoa("joao"),
				new Pessoa("Andre") };
		SortUtil.sort(array);
	}
}
