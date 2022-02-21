package exercicios.java02;

/*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. */

import java.util.Scanner;

public class ComandosDeRepeticao14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 20 números: ");
        int numeros;
        int i = 1;

        int entreZeroECem = 0;
        int entreCemEDuz = 0;
        int maiorDuz = 0;

        while (i <= 20) {
            numeros = sc.nextInt();
            i++;
            if (numeros >= 0 && numeros <= 100) {
                entreZeroECem += 1;
            } else if (numeros > 100 && numeros <= 200) {
                entreCemEDuz += 1;
            } else {
                maiorDuz += 1;
            }
        }
        System.out.println("Números entre 0-100 = " + entreZeroECem);
        System.out.println("Números entre 101-200 = " + entreCemEDuz);
        System.out.println("Números maiores que 200 = " + maiorDuz);


        sc.close();
    }
}
