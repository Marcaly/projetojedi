package javaExercicios;

/*Ler valores para as variáveis x e y, trocar os valores das variáveis e apresentar o resultado dos valores invertidos.
 */

import java.util.Scanner;

public class JavaExc7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com 2 números: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("O valor de X é = " + x + " e o  valor de Y é = " + y);

        int troca = y;
        y = x;
        x = troca;
        System.out.println("O valor das variaveis com os valores trocados é X = " + x + " e Y = " + y);

        sc.close();
    }
}
