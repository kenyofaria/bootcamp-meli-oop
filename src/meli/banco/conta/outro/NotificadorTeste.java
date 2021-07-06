package meli.banco.conta.outro;

public class NotificadorTeste {

	public static void main(String[] args) {
		Notificacao email = new NotificacaoEmail();
		Notificacao sms = new NotificacaoSms();
		Notificacao wapp = new NotificacaoWhatsApp();
		
		Notificador notificador = new Notificador();
		notificador.executa(email);
		notificador.executa(sms);
		notificador.executa(wapp);
	}
}
