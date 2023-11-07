import java.util.*;

class Carteira {

private Investidor investidor;

private Map<Ativo, Integer> ativosNaCarteira;

public Carteira(Investidor investidor) {

this.investidor = investidor;

this.ativosNaCarteira = new HashMap<>();

}

public void adicionarAtivo(Ativo ativo, int quantidade) {

int quantidadeAtual = ativosNaCarteira.getOrDefault(ativo, 0);

quantidadeAtual += quantidade;

ativosNaCarteira.put(ativo, quantidadeAtual);

}

public void removerAtivo(Ativo ativo, int quantidade) {

if (ativosNaCarteira.containsKey(ativo)) {

int quantidadeAtual = ativosNaCarteira.get(ativo);

quantidadeAtual -= quantidade;

if (quantidadeAtual <= 0) {

ativosNaCarteira.remove(ativo);

} else {

ativosNaCarteira.put(ativo, quantidadeAtual);

}

}

}

public boolean contemAtivo(Ativo ativo, int quantidade) {

return ativosNaCarteira.getOrDefault(ativo, 0) >= quantidade;

}

// Obter a quantidade de um ativo na carteira

public int getQuantidadeAtivo(Ativo ativo) {

return ativosNaCarteira.getOrDefault(ativo, 0);

}
  
}
