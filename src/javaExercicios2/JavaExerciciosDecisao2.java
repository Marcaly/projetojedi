package javaExercicios2;

/*Desenvolva uma rotina que dados três números inteiros, apresente-os em ordem crescente
 */

import java.util.Arrays;
import java.util.Scanner;

public class JavaExerciciosDecisao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 3 números para colocar em ordem crescente");
        int[] numeros = new int[3];
        numeros[0] = sc.nextInt();
        numeros[1] = sc.nextInt();
        numeros[2] = sc.nextInt();
        Arrays.sort(numeros);

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        sc.close();
    }
}
