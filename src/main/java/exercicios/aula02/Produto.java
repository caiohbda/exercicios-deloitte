package exercicios.aula02;

public class Produto {
    private int preco;

    public Produto(int preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double desconto) {
      double precoComDesconto = this.preco * (desconto/100);
      precoComDesconto = this.preco - precoComDesconto;
      System.out.println(precoComDesconto);
       return precoComDesconto;
    }

}

