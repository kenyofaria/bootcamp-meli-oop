package meli.banco.conta.outro;

public class NotificacaoEmail implements Notificacao{

	@Override
	public void envia() {
		System.out.println("enviando email");
	}

}
