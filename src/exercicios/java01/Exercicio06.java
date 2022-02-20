package exercicios.java01;

/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));
    }
}
