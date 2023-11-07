import java.util.*;

class Corretora {

private String nome;

private List<Ordem> ordens;

public Corretora(String nome) {

this.nome = nome;

this.ordens = new ArrayList<>();

}

public double calcularComissaoCompra(double valorTotal) {

double comissaoPercentual = 0.001; // 0.1%

double taxaFixa = 5.0;

return (valorTotal * comissaoPercentual) + taxaFixa;

}

public double calcularComissaoVenda(double valorTotal) {

double comissaoPercentual = 0.002; // 0.2%

double taxaFixa = 10.0;

return (valorTotal * comissaoPercentual) + taxaFixa;

}

}