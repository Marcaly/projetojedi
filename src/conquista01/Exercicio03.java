package conquista01;

/*Criar um código dentro do método main que soma dois números e exibe o valor ao final do programa.*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, sum;
        System.out.println("enter the numbers to be summed: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("the sum result is: " + x + y);

        sc.close();
    }
}
