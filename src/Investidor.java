import java.util.*;

class Investidor {

          private String nome;
          
          private Carteira carteira;
          
          private HistoricoOrdens historicoOrdens;

          private Double saldo = 2000.0;

          private int QuantidadeAtivo;
          
          public Investidor(String nome) {
          
          this.nome = nome;
          
          this.carteira = new Carteira(null);
          
          this.historicoOrdens = new HistoricoOrdens();
          
          }
          
          public void comprarAtivo(Ativo ativo, int quantidade, double precoUnitario, Corretora corretora) {
          
          double comissao = corretora.calcularComissaoCompra(quantidade * precoUnitario);
          
          double valorTotal = quantidade * precoUnitario + comissao;
          
          if (saldo < valorTotal) {
          
          throw new IllegalStateException("Saldo insuficiente para comprar.");
          
          }
          
          saldo -= valorTotal;
          
          carteira.adicionarAtivo(ativo, quantidade);
          
          // Registrar a transação
          
          Transacao transacao = new Transacao(ativo, quantidade, precoUnitario, null);
          
          historicoOrdens.adicionarTransacao(transacao);

          QuantidadeAtivo += 1;
          
          }
          
          public void venderAtivo(Ativo ativo, int quantidade, double precoUnitario, Corretora corretora) {
          
          if (!carteira.contemAtivo(ativo, quantidade)) {
          
          throw new IllegalStateException("Quantidade insuficiente do ativo na carteira.");
          
          }
          
          double comissao = corretora.calcularComissaoVenda(quantidade * precoUnitario);
          
          double valorTotal = quantidade * precoUnitario - comissao;
          
          saldo += valorTotal;
          
          carteira.removerAtivo(ativo, quantidade);
          
          // Registrar a transação
          
          Transacao transacao = new Transacao(ativo, quantidade, precoUnitario, null);
          
          historicoOrdens.adicionarTransacao(transacao);

          QuantidadeAtivo -= 1;
          
          }

          public int getQuantidadeAtivoNaCarteira() {
                    return QuantidadeAtivo;
                    }
                    

          public Double getSaldo() {
                    return saldo;
                    }
                    

 }