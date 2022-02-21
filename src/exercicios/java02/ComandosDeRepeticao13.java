package exercicios.java02;

/* Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100. */

import java.util.Scanner;

public class ComandosDeRepeticao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 20 numeros para analisar quantos estão entre 0 e 100: ");

        int numero;
        int entreZeroECem = 0;
        for (int i = 0; i < 20; i++) {
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 100) {
                entreZeroECem += 1;
            }
        }
        System.out.println(entreZeroECem + " estão no entre 0 e 100");

        sc.close();

    }
}
