# 📬 Gerenciador de Notificações — Java POO

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat&logo=java)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=flat)

Projeto desenvolvido para praticar conceitos de Programação Orientada a Objetos, Design Patterns e Collections em Java, como parte da trilha de estudos para Desenvolvedor Java Back-End - Curso IsiFLIX.

---

## 🚀 Funcionalidades

- Envio de notificações por Email ou SMS, sem que o código que dispara o envio precise saber qual tipo está sendo usado
- Histórico de notificações enviadas, sem permitir duplicatas (mesmo destinatário + mesma mensagem)
- Configuração global única do sistema (remetente padrão e limite de envios por hora)

---

## 🧠 Conceitos aplicados

- Interfaces e Polimorfismo
- Enum (`TipoNotificacao`)
- Design Pattern — Singleton (`ConfiguracaoSistema`)
- Set e LinkedHashSet (coleções)
- `equals()` e `hashCode()` customizados
- Separação de responsabilidades em pacotes

---

## 📁 Estrutura do projeto

src/
├── Main.java → execução do programa
├── model/ → entidades do sistema (Notificacao, TipoNotificacao, Notificador, EmailNotificador, SmsNotificador)
├── config/ → configuração global (ConfiguracaoSistema)
└── service/ → regras de histórico (HistoricoNotificacoes)

---

## ▶️ Execução

1. Clone o repositório
2. Abra o projeto na sua IDE (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Main.java`
4. Veja no console o envio das notificações e o histórico final (sem duplicatas)

---

## ⚙️ Melhorias futuras

- [ ] Lançar exceções customizadas em vez de retornar apenas `boolean` em caso de falha no envio
- [ ] Aplicar o padrão Factory para a criação dos notificadores
- [ ] Persistir o histórico em banco de dados
- [ ] Adicionar testes unitários (JUnit)
