package javaExercicios;

/*Escreva um programa que realize a conversão de graus Fahrenheit (F)  para graus Celsius (C). Utilize a fórmula abaixo:

C = (( F - 32)  5)9 */


import java.util.Scanner;

public class JavaExc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Fahrenheit");
        double Fahren = sc.nextDouble();

        System.out.println();


        sc.close();
    }
}
