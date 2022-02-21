package javaExerciciosDevDojo.javaVariaveisExc;

/*Calcular e apresentar o valor de uma prestação em atraso, utilize a fórmula abaixo:

P=VALOR + (VALOR (TAXA100)TEMPO)

Onde P é o valor da prestação em atraso.*/

import java.util.Scanner;

public class JavaExc08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da prestação:");
        double valor = sc.nextDouble();
        System.out.println("Entre com a taxa de atraso da prestação: ");
        double taxa = sc.nextDouble();
        System.out.println("Entre com o tempo de atraso da prestação: ");
        double tempo = sc.nextDouble();

        System.out.println("O valor da prestação em atraso é = " + (valor + (valor * (taxa / 100 ) * tempo)));
        double prestacao = valor + (valor * (taxa / 100) * tempo);



        sc.close();
    }
}
