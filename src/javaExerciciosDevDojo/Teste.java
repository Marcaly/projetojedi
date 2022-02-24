package javaExerciciosDevDojo;

import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i <3; i++) {
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println(numeros[2]);




        sc.close();
    }
}
