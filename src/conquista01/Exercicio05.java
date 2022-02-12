package conquista01;

/*Criar um código que realiza todas as funções aritméticas usando os operadores*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with two numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;
        int minus = x - y;
        int multip = x * y;
        int div = x / y;
        int rest = x % y;

        System.out.printf(" SUM = %d%n MINUS = %d%n MULTIPLICATION = %d%n DIVISION = %d%n REST = %d%n ",
                sum, minus, multip, div, rest);

        sc.close();

    }
}
