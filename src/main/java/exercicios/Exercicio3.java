package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    Scanner scanner = new Scanner(System.in);

    public double verificarMedia() {
        System.out.println("digite a primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("digite a segunda nota");
        double nota2 = scanner.nextDouble();
        System.out.println("digite a terceira nota");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A media é: " + media);

        if(media >= 7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }

        return media;
    }
}
