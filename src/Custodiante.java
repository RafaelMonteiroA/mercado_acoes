import java.util.*;

class Custodiante {

private Map<Ativo, Integer> custodia; // Mapeia ativos para suas quantidades em custódia

public Custodiante() {

this.custodia = new HashMap<>();

}

// Adicionar ativos à custódia

public void adicionarAtivo(Ativo ativo, int quantidade) {

custodia.put(ativo, quantidade);

}

// Remover ativos da custódia

public void removerAtivo(Ativo ativo, int quantidade) {

if (custodia.containsKey(ativo)) {

int quantidadeAtual = custodia.get(ativo);

if (quantidade <= quantidadeAtual) {

quantidadeAtual -= quantidade;

if (quantidadeAtual == 0) {

custodia.remove(ativo);

} else {

custodia.put(ativo, quantidadeAtual);

}

}

}

}

// Verificar se um ativo está em custódia

public boolean possuiAtivo(Ativo ativo) {

return custodia.containsKey(ativo);

}

// Obter a quantidade de um ativo em custódia

public int getQuantidadeEmCustodia(Ativo ativo) {

return custodia.getOrDefault(ativo, 0);

}

}