package meli.banco.conta.outro;

public class NotificacaoWhatsApp implements Notificacao{

	@Override
	public void envia() {
		System.out.println("enviando zap zap");
	}

}
