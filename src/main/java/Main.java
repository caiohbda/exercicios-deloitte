import exercicios.aula01.Exercicio1;
import exercicios.aula01.Exercicio2;
import exercicios.aula01.Exercicio3;
import exercicios.aula01.Exercicio4;
import exercicios.aula02.Pessoa;
import exercicios.aula02.Produto;

public class Main {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        Exercicio2 exercicio2 = new Exercicio2();
        Exercicio3 exercicio3 = new Exercicio3();
        Exercicio4 exercicio4 = new Exercicio4();
        Pessoa pessoa1 = new Pessoa("caio", 17, 64.00, 1.72, "12345678911" );
        Pessoa pessoa2 = new Pessoa("henrique", 17, 80.70, 1.92, "123456789");
        Produto produto1 = new Produto(100);

        produto1.aplicarDesconto(10);
        pessoa1.verificarIdade(pessoa1.getIdade());
        pessoa1.compararIdades(pessoa1.getIdade(), pessoa2.getIdade(), pessoa1.getNome(), pessoa2.getNome());
        pessoa1.calcularImc();
        pessoa1.validarCpf();
        pessoa2.validarCpf();

        exercicio1.somar();
        exercicio2.verificaPar();
        exercicio3.verificarMedia();
        exercicio4.tabuadacinco();
    }
}