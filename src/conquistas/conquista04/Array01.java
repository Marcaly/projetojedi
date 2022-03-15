package conquistas.conquista04;

import java.util.Scanner;

/*Criar um código que inicializa um array com 5 valores e também um segundo array
que vai receber os mesmo valores do primeiro utilizando atribuição. B[0] = A[0].
 Deve se usar um laço de Repetição e não atribuir de forma direta os valores.
*/
public class Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valores[] = new int[5];
        int valores2[] = new int[5];
        int i;

        System.out.println("Insira 5 números:");
        for (i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
            valores2[i] = valores[i];
        }



        sc.close();
    }
}
