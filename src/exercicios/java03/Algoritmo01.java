package exercicios.java03;

/*Crie um algoritmo que leia um número diferente de zero e diga se este número é
positivo ou negativo.*/

import java.util.Scanner;

public class Algoritmo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ditite um número diferente de zero para verificar se é positivo ou negativo: ");

        int numero =  sc.nextInt();
        if (numero < 0) {
            System.out.println("O numero é negativo");
        }else if (numero > 0){
            System.out.println("O número é positivo");
        }



        sc.close();
    }
}
