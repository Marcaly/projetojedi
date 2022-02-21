package exercicios.java02;

/*Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
pares */

import java.util.Scanner;

public class ComandosDeRepeticao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 20 numeros para analisar quantos são pares: ");

        int numero;
        int numerosPares = 0;
        for (int i = 0; i < 20; i++) {
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                numerosPares +=1;
            }
        }
        System.out.println(numerosPares +" dos números inseridos são pares");

        sc.close();
    }
}
