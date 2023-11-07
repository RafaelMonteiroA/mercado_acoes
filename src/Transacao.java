import java.util.*;

class Transacao {

public enum Tipo {

COMPRA,

VENDA

}

private Ativo ativo;

private int quantidade;

private double preco;

private double precoUnitario;

private double valorTotal;

private double comissao;

private Tipo tipo;

public Transacao(Ativo ativo, int quantidade, double preco, Tipo tipo) {

this.ativo = ativo;

this.quantidade = quantidade;

this.preco = preco;

this.tipo = tipo;

}

public void exibirDetalhes() {

System.out.println("Ativo: " + ativo.getNome());

System.out.println("Quantidade: " + quantidade);

System.out.println("Preço Unitário: " + precoUnitario);

System.out.println("Valor Total: " + valorTotal);

System.out.println("Comissão: " + comissao);

System.out.println("Tipo: " + (tipo == Tipo.COMPRA ? "Compra" : "Venda"));

}

}