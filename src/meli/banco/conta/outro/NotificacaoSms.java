package meli.banco.conta.outro;

public class NotificacaoSms  implements Notificacao{

	@Override
	public void envia() {
		System.out.println("enviando sms");
	}

}
