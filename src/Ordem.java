import java.util.*;

class Ordem {

private Investidor investidor;

private Ativo ativo;

private int quantidade;

private double preco;

private TipoOrdem tipo;

// Enumeração para Tipo de Ordem (Compra ou Venda)

enum TipoOrdem {

COMPRA,

VENDA

}

public Ordem(Investidor investidor, Ativo ativo, int quantidade, double preco, TipoOrdem tipo) {

this.investidor = investidor;

this.ativo = ativo;

this.quantidade = quantidade;

this.preco = preco;

this.tipo = tipo;

}

public void processarOrdem() {

if (tipo == TipoOrdem.COMPRA) {

investidor.comprarAtivo(ativo, quantidade, preco, null);;

} else if (tipo == TipoOrdem.VENDA) {

investidor.venderAtivo(ativo, quantidade, preco, null);;

}

}

} 