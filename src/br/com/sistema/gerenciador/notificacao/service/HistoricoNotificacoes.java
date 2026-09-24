package br.com.sistema.gerenciador.notificacao.service;

import br.com.sistema.gerenciador.notificacao.model.Notificacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class HistoricoNotificacoes {

    private Set<Notificacao> historico;
    public HistoricoNotificacoes() {
        this.historico = new LinkedHashSet<>();
    }

    public Set<Notificacao> getHistorico() {
        return historico;
    }

    public boolean adicionar(Notificacao notificacao){
        return historico.add(notificacao);
    }
}
