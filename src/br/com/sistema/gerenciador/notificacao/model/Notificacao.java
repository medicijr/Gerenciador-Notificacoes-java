package br.com.sistema.gerenciador.notificacao.model;

import java.util.Objects;

public class Notificacao {
    private String destinatario;
    private String mensagem;
    private TipoNotificacao tipo;

    public Notificacao(String destinatario, String mensagem, TipoNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public TipoNotificacao getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notificacao that)) return false;
        return Objects.equals(getDestinatario(),
                that.getDestinatario()) && Objects.equals(getMensagem(),
                that.getMensagem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestinatario(), getMensagem());
    }

    @Override
    public String toString() {
        return "Notificacao" + "\n" +
                "Destinatario = " + destinatario +
                ", Mensagem = " + mensagem +
                ", Tipo = " + tipo;
    }
}
