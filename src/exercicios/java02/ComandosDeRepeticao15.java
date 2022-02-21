package exercicios.java02;

/*Escreva um algoritmo que leia uma sequência de números do usuário e realize a
soma desses números. Encerre a execução quando um número negativo for digitado.*/

import java.util.Scanner;

public class ComandosDeRepeticao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira uma sequencia de números positivos para fazer a soma. " +
                "(Entre com um número negativo para efetuar a soma) ");

        int soma = 0;
        int numeros = sc.nextInt();

        while (numeros >= 0) {
            soma += numeros;
            numeros = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
    }
}
