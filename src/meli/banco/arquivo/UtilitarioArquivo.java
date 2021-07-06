package meli.banco.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UtilitarioArquivo {

	public void escreveArquivo() throws FileNotFoundException{
		File file = new File("bootcamp.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		System.out.println("estou executando algo");
	}
	
	public void acao() {
		throw new RuntimeException("deu caca.");
	}
}
