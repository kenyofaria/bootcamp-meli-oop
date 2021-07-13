package com.dh.meli.arquivo;

import java.io.IOException;

public class Main {

	
	public static void main(String[] args) throws IOException {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuarioDAO.salva(usuario);
	}
}
