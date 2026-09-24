package br.com.sistema.gerenciador.notificacao;

import br.com.sistema.gerenciador.notificacao.config.ConfiguracaoSistema;
import br.com.sistema.gerenciador.notificacao.model.*;
import br.com.sistema.gerenciador.notificacao.service.HistoricoNotificacoes;

public class Main {
    public static void main(String[] args) {

        ConfiguracaoSistema configuracaoSistema = ConfiguracaoSistema.getInstance();
        Notificador emailNortificador = new EmailNotificador();
        Notificador smslNortificador = new SmsNotificador();
        HistoricoNotificacoes historico = new HistoricoNotificacoes();

        Notificacao notificacao = new Notificacao("medici@gmai.com", "Sua compra foi aprovada", TipoNotificacao.EMAIL);
        Notificacao notificacao2 = new Notificacao("joao@email.com", "Sua fatura venceu", TipoNotificacao.EMAIL);
        Notificacao notificacao3 = new Notificacao("maria@email.com", "Seu pedido foi enviado", TipoNotificacao.SMS);
        Notificacao notificacao4 = new Notificacao("joao@email.com", "Sua fatura venceu", TipoNotificacao.SMS);

        System.out.println(configuracaoSistema.getRemetentePadrao());
        System.out.println(configuracaoSistema.getLimiteEnviosPorHora());

        emailNortificador.enviar(notificacao);
        emailNortificador.enviar(notificacao2);

        smslNortificador.enviar(notificacao3);
        smslNortificador.enviar(notificacao4);

        historico.adicionar(notificacao);
        historico.adicionar(notificacao2);
        historico.adicionar(notificacao3);
        historico.adicionar(notificacao4);

        System.out.println(historico.getHistorico());

    }
}
