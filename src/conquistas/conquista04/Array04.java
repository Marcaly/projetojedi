package conquistas.conquista04;

/*Criar e inicializar um array de inteiros de tamanho 10.
 Criar também um fluxo que vai ler os dados desse array
 e ao final dizer quantos valores são pares e quantos são ímpares*/

import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteiros[] = new int[10];
        int pares = 0;
        int impares = 0;

        System.out.println("Insira 10 números para analisar quantos são pares e quantos são ímpares:");
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = sc.nextInt();
            if (inteiros[i] % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);


        sc.close();
    }
}
