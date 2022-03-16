package exercicios.java03;

/*Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2 através de
somas repetidas. (ex: 2 e 3 = 2 + 2 + 2)*/

import java.util.Scanner;

public class Algoritmo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 2 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int multip = 0;

        for (int i = 0; i < num2; i++) {
            multip += num1;
        }
        System.out.println(multip);


        sc.close();

    }
}