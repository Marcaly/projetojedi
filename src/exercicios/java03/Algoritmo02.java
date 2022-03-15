package exercicios.java03;

/*Crie um algoritmo que receba 3 números e informe qual o maior entre eles.*/

import java.util.Scanner;

public class Algoritmo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[3];
        int maior = 0;
        System.out.println("Insira 3 números para verificar qual é o maior: ");
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);



        sc.close();
    }
}
