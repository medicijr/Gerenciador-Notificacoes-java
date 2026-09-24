    package br.com.sistema.gerenciador.notificacao.config;

    public class ConfiguracaoSistema {
        private String remetentePadrao;
        private int limiteEnviosPorHora;
        private static ConfiguracaoSistema instance;

        private ConfiguracaoSistema(){
            this.remetentePadrao = "sistema@empresa.com";
            this.limiteEnviosPorHora = 100;
        }
        public static ConfiguracaoSistema getInstance(){
            if (instance == null){
                instance = new ConfiguracaoSistema();
            }
            return instance;
        }

        public String getRemetentePadrao() {
            return remetentePadrao;
        }

        public int getLimiteEnviosPorHora() {
            return limiteEnviosPorHora;
        }
    }
