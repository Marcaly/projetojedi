package javaExerciciosDevDojo.javaVariaveisExc;

/*Desenvolver um programa que apresente e calcule o volume de uma caixa retangular, utilize a fórmula abaixo:

V=CLA

Onde:
	V = Volume em cm3
	C = Comprimento
	L = Largura
	A = Altura
*/

import java.util.Scanner;

public class JavaExc09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a largura da caixa: ");
        double largura = sc.nextDouble();
        System.out.println("Insira o comprimento da caixa: ");
        double comprimento = sc.nextDouble();
        System.out.println("Insira a altura da caixa: ");
        double altura = sc.nextDouble();

        System.out.println("O volume da caixa retangular é =  " + comprimento * largura * altura + "cm³");


        sc.close();
    }
}
