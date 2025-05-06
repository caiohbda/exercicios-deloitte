import exercicios.*;

public class Main {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        Exercicio2 exercicio2 = new Exercicio2();
        Exercicio3 exercicio3 = new Exercicio3();
        Exercicio4 exercicio4 = new Exercicio4();
        Pessoa pessoa1 = new Pessoa("caio", 17);
        Pessoa pessoa2 = new Pessoa("henrique", 17);

        pessoa1.verificarIdade();

       if(pessoa1.getIdade() > pessoa2.getIdade()) {
           System.out.println(pessoa1.getNome() + " tem a idade superior");
       } else if(pessoa2.getIdade() > pessoa1.getIdade()) {
           System.out.println(pessoa2.getNome() + " tem a idade superior");
       } else {
           System.out.println("os dois tem idades iguais.");
       }

        exercicio1.somar();
        exercicio2.verificaPar();
        exercicio3.verificarMedia();
        exercicio4.tabuadacinco();
    }
}