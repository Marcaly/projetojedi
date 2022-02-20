package exercicios.java02;

/*) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
números. */

import java.util.Scanner;

public class ComandosDeRepeticao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 10 numeros inteiros para fazer a soma: ");
        int soma = 0;
        int numeros = 0;
        for (int i = 0; i < 10; i++) {
            numeros = sc.nextInt();
            soma += numeros;
        }
        System.out.println(soma);


        sc.close();
    }
}
