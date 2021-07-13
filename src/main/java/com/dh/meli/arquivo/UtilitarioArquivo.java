package com.dh.meli.arquivo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UtilitarioArquivo {

	public void escreveArquivo() throws IOException{
		File file = new File("bootcamp.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.close();
	}
	
	public void acao() {
		throw new RuntimeException("deu caca.");
	}
}
