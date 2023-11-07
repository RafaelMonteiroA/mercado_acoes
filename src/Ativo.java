import java.util.*;

class Ativo {

private String nome;

private double precoAtual;

private List<Double> historicoPreco;

public Ativo(String nome) {

this.nome = nome;

this.precoAtual = 0.0;

this.historicoPreco = new ArrayList<>();

}

public String getNome() {

return nome;

}

public double getPrecoAtual() {

return precoAtual;

}

public void setPrecoAtual(double precoAtual) {

this.precoAtual = precoAtual;

historicoPreco.add(precoAtual);

}

public List<Double> getHistoricoPreco() {

return Collections.unmodifiableList(historicoPreco);

}

}