package exercicioslide.aula02;

public class Produto {
    private int preco;

    public Produto(int preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double desconto) {
      double descontoProduto = this.preco * (desconto/100);
      double precoComDesconto = this.preco - descontoProduto;
      System.out.println(precoComDesconto);
      return precoComDesconto;
    }

}

