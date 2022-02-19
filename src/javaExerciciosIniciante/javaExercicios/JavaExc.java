package javaExerciciosIniciante.javaExercicios;

/*Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um círculo.

A = R2

Onde:
 	A representa a área do círculo
  	 = 3.141592654
	R = Raio do círculo (deve ser fornecido pelo usuário)
*/

import java.util.Scanner;

public class JavaExc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo");

        double raio = sc.nextDouble();

        System.out.println("A area do circulo é: " + raio * raio * 3.14 + " metros");

        sc.close();
    }
}
