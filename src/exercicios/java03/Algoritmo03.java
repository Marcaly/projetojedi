package exercicios.java03;

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

import java.util.Scanner;

public class Algoritmo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diasDeVida = 0;
        System.out.println("Informe a sua idade em anos, meses e dias para ver quantos dias você viveu");

        System.out.print("Anos: ");
        int anos = sc.nextInt();
        System.out.print("Meses: ");
        int meses = sc.nextInt();
        System.out.print("Dias: ");
        int dias = sc.nextInt();

        System.out.println("Você já viveu " + (anos * 365 + meses * 30 + dias) + " dias");


        sc.close();
    }
}
