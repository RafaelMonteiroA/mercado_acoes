import java.util.*;

class Bolsa {

private List<Ativo> ativos;

public Bolsa() {

this.ativos = new ArrayList<>();

}

public void adicionarAtivo(Ativo ativo) {

ativos.add(ativo);

}

public void listarAtivosDisponiveis() {

for (Ativo ativo : ativos) {

System.out.println(ativo.getNome());

}

}

public Ordem realizarNegociacao(Ativo ativo, int quantidade, double preco, Investidor investidor, Ordem.TipoOrdem tipo) {

if (!ativos.contains(ativo)) {

throw new IllegalArgumentException("Ativo não disponível na bolsa.");

}

if (quantidade <= 0) {

throw new IllegalArgumentException("Quantidade inválida.");

}

if (tipo == Ordem.TipoOrdem.COMPRA) {

if (investidor.getSaldo() < quantidade * preco) {

throw new IllegalStateException("Saldo insuficiente para comprar.");

}

} else if (tipo == Ordem.TipoOrdem.VENDA) {

int quantidadeNaCarteira = investidor.getQuantidadeAtivoNaCarteira();

if (quantidade > quantidadeNaCarteira) {

throw new IllegalStateException("Quantidade insuficiente do ativo na carteira.");

}

}

Ordem ordem = new Ordem(investidor, ativo, quantidade, preco, tipo);

ordem.processarOrdem();

return ordem;

}

} 