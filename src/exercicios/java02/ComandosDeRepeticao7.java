package exercicios.java02;

/*Leia a idade de 20 pessoas e exiba a média das idades. */

import java.util.Scanner;

public class ComandosDeRepeticao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a idade de 20 pessoas para fazer media das idades: ");
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            int idades = sc.nextInt();
            soma += idades;
        }
        System.out.println(soma/20);


        sc.close();
    }
}
