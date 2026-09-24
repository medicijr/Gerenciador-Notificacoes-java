package br.com.sistema.gerenciador.notificacao.model;

public class SmsNotificador implements Notificador {
    @Override
    public boolean enviar(Notificacao mensagem) {
        System.out.println("Enviado para " + mensagem.getDestinatario() + ": " + mensagem.getMensagem());
        return true;
    }
}
