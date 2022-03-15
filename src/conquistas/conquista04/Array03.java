package conquistas.conquista04;

/*Criar dois arrays de tipo inteiro de tamanho 10 e inicializar os dois com valores diferentes.
Criar também um segundo array de 10 posições que vai receber como valor para cada posição
 a subtração do array A pelo array B.
C = A - B
*/

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayA[] = new int[3];
        int arrayB[] = new int[3];
        int arrayC[] = new int[3];
        int i;

        System.out.println("Entre com 10 números: ");
        for (i = 0; i < arrayA.length; i++) {
            arrayA[i] = sc.nextInt();
        }

        System.out.println("Entre com mais 10 números para efetuar a subtração: ");
        for (i = 0; i < arrayB.length; i++) {
            arrayB[i] = sc.nextInt();
        }

        for (i = 0; i < arrayC.length; i++) {
            arrayC[i] = arrayA[i] - arrayB[i];
            System.out.println(arrayC[i]);
        }


        sc.close();

    }
}
