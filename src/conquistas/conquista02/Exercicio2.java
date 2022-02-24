package conquistas.conquista02;

/*Criar um código que verifica se um valor de uma variável é igual a cem.
Caso verdadeiro, escrever no console: “Verdadeiro”. Caso falso, escrever no console: “Falso”
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to verify: ");
        int number = sc.nextInt();

        if (number == 100) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("False");
        }

    }
}
