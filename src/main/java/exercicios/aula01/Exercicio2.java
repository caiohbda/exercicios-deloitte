package exercicios.aula01;

import java.util.Scanner;

public class Exercicio2 {
    Scanner scanner = new Scanner(System.in);
    public void verificaPar() {
        System.out.println("digite um numero pra saber se é par ou impar: ");
        int num3 = scanner.nextInt();
        if(num3 % 2 == 0) {
            System.out.println("o numero é par");
        } else {
            System.out.println("o numero é impar");
        }
    }
}
