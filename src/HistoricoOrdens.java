import java.util.*;

class HistoricoOrdens {

private List<Transacao> transacoes;

public HistoricoOrdens() {

this.transacoes = new ArrayList<>();

}

public void adicionarTransacao(Transacao transacao) {

transacoes.add(transacao);

}

public void exibirHistorico() {

for (Transacao transacao : transacoes) {

transacao.exibirDetalhes();

System.out.println();

  }
 }
}