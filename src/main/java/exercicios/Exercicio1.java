package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    Scanner scanner = new Scanner(System.in);

    public double somar() {
        System.out.println("digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        double numSoma = num1 + num2;
        System.out.println("a soma dos numeros é: " + numSoma);

        return numSoma;
    }
}
