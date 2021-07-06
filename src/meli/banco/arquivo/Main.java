package meli.banco.arquivo;

import java.io.FileNotFoundException;

public class Main {

	
	public static void main(String[] args) throws FileNotFoundException {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuarioDAO.salva(usuario);
	}
}
