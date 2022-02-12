package conquista02;

/*Criar um código que verifica se um valor de uma variável é igual a 100.
 Caso verdadeiro, escrever no console: “Verdadeiro”*/


import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a number to verify: ");
        int number = sc.nextInt();

        if (number == 100) {
            System.out.println("Verdadeiro");
        }


        sc.close();
    }
}
