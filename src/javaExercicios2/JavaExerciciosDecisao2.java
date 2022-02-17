package javaExercicios2;

/*Desenvolva uma rotina que dados três números inteiros, apresente-os em ordem crescente
 */

import java.util.Scanner;

public class JavaExercicioDecisao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menor = 0;
        int meio = 0;
        int maior = 0;

        System.out.println("Insira 3 numeros inteiros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            menor = n1;
            System.out.println(menor);
        } else if (n2 < n1 && n2 < n3) {
            menor = n2;
            System.out.println(menor);
        } else {
            menor = n3;
            System.out.println(menor);
        }

        if (n1 < n2 && n1 > n3) {
            meio = n1;
            System.out.println(meio);
        } else if (n2 < n1 && n2 > n3) {
            meio = n2;
            System.out.println(meio);
        } else {
            meio = n3;
            System.out.println(meio);
        }
        if (n1 > n2 && n1 > n3) {
            maior = n1;
            System.out.println(maior);
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
            System.out.println(maior);
        } else {
            maior = n3;
            System.out.println(maior);
        }


        sc.close();
    }
}
