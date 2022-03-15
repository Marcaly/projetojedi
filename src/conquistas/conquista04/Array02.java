package conquistas.conquista04;

/*Criar um array de 10 posições de tipo inteiro que vai receber 10 valores.
 Criar também um segundo array de tipo String que vai receber o valor do
  primeiro multiplicado por 5 com a seguinte descrição: "O valor multiplicado por 5 é: "*/

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array1[] = new int[10];
        String array2[] = new String[10];
        int i;

        System.out.println("Entre com 10 números para analisar qual o valor deles se multiplicado por 5:");
        for (i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
            array2[i] = "O valor multiplicado por 5 é: " + (array1[i] * 5);

        }
        for (i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
