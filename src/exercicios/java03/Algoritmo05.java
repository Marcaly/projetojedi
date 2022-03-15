package exercicios.java03;

/*Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse número e
mostra o resultado*/

import java.util.Scanner;

public class Algoritmo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número que deseja fatorar");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("A fatorial do número " + numero + " = " + fatorial);




        sc.close();
    }
}
