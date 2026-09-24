package br.com.sistema.gerenciador.notificacao.model;

public class EmailNotificador implements Notificador  {
    @Override
    public boolean enviar(Notificacao mensagem) {
        System.out.println("Enviado para "+ mensagem.getDestinatario() + ": " + mensagem.getMensagem());
        return true;
    }
}
