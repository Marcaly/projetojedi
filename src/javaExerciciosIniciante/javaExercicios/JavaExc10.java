package javaExerciciosIniciante.javaExercicios;

import java.util.Scanner;

/*Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao quadrado,
 ao cubo e a 10, apresentar também a soma total dos três resultados anteriores.
*/
public class JavaExc10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num + " elevado ao quadrado = " + Math.pow(num, 2));
        System.out.println(num + " elevado ao cubo = " + Math.pow(num, 3));
        System.out.println(num + " elevado à 10 = " + Math.pow(num, 10));
        System.out.println("A soma dos resultados é igual à = " + (Math.pow(num, 2) + Math.pow(num, 3) + Math.pow(num, 10)));

    }
}
