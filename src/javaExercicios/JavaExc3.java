package javaExercicios;

/*Escreva um programa que realize a conversão de graus Celsius (C)  para graus Fahrenheit (F). Utilize a fórmula abaixo:

F = ( 9 C) 5 */

import java.util.Scanner;

public class JavaExc3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a temperatura em celsius");
        double celsius = sc.nextDouble();

        System.out.println((9 * celsius) /5 + 32);

        sc.close();
    }
}
