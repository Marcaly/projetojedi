package exercicios.java02;

/*Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
multiplicação.*/

import java.util.Scanner;

public class ComandosDeRepeticao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int numero = sc.nextInt();
        System.out.println("A tabuada do número " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }


        sc.close();
    }
}
