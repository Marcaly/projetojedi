package exercicios.java01;

/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.
(1SM=R$788,00)*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 788.00;
        System.out.println("Insira o valor do salário do usúario");
        double salarioUser = sc.nextDouble();
        System.out.printf("O usuário ganha: %.2f salários mínimos", salarioUser / salarioMinimo);

        sc.close();
    }
}
