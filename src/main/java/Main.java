import exercicios.Exercicio1;
import exercicios.Exercicio2;
import exercicios.Exercicio3;
import exercicios.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();
        Exercicio2 exercicio2 = new Exercicio2();
        Exercicio3 exercicio3 = new Exercicio3();
        Exercicio4 exercicio4 = new Exercicio4();

        exercicio1.somar();
        exercicio2.verificaPar();
        exercicio3.verificarMedia();
        exercicio4.tabuadacinco();
    }
}