package exercicios.java02;

/*Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
maiores do que 8.*/

import java.util.Scanner;

public class ComandosDeRepeticao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 20 numeros para analisar quantos são maiores do que 8");

        int numero = sc.nextInt();
        int numerosMaiores =0;
        for (int i = 0; i < 20; i++) {
            numero = sc.nextInt();
            if (numero > 8) {
                numerosMaiores += 1;
            }
        }
        System.out.println(numerosMaiores + " dos números inseridos são maiores que 8");

        sc.close();
    }
}
