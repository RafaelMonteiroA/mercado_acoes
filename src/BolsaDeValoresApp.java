import java.util.*;

public class BolsaDeValoresApp { 
public static void main(String[] args) {

// Crie instâncias de Investidores, Ativos, Corretoras, Bolsa, Custodiante, etc.

Investidor investidor1 = new Investidor("Investidor1");

Investidor investidor2 = new Investidor("Investidor2");

Ativo acao1 = new Ativo("Ação1");

Ativo acao2 = new Ativo("Ação2");

Corretora corretora1 = new Corretora("Corretora1");

Corretora corretora2 = new Corretora("Corretora2");

Bolsa bolsa = new Bolsa();

bolsa.adicionarAtivo(acao1);

bolsa.adicionarAtivo(acao2);

// Simule operações de bolsa

bolsa.realizarNegociacao(acao1, 100, 50.0, investidor1, Ordem.TipoOrdem.COMPRA);

bolsa.realizarNegociacao(acao2, 50, 60.0, investidor2, Ordem.TipoOrdem.COMPRA);

bolsa.realizarNegociacao(acao1, 75, 55.0, investidor1, Ordem.TipoOrdem.VENDA);

// Consultar histórico de ordens

HistoricoOrdens historicoOrdens = new HistoricoOrdens();



}

}