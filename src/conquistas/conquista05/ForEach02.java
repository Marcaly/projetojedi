package conquistas.conquista05;

/*Criar um array de tipo inteiro de 100 posições que vai receber valores de 0 a 100.
Inicializar esse valores usando um laço de Repetição.
E utilizando o foreach, printar todos os valores multiplicando por 2.
*/

import java.util.Scanner;

public class ForEach02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteiros[] = new int[100];
        int i = 1;
        while (i < inteiros.length) {
            inteiros[i] += i;
            i++;
        }
        for (int inteiro : inteiros) {
            System.out.println(inteiro + " * 2 = " + inteiro * 2);
        }


        sc.close();
    }
}
