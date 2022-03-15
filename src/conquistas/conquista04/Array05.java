package conquistas.conquista04;

/*Criar e inicializar um array de 10 posições que vai receber 10 valores inteiros.
Criar também um fluxo que vai ler o array e ao final exibir os seguintes dados:
Quantos valores são maiores que 15
Quantos valores são negativos
Quantos valores são múltiplos de 5
Qual a soma total dos valores
*/

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inteiros[] = new int[10];

        int maiores = 0;
        int negativos = 0;
        int multiplos = 0;
        int soma = 0;

        System.out.println("Insira 10 números para analisar alguns dados: ");
        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = sc.nextInt();
            soma += inteiros[i];

            if (inteiros[i] > 15) {
                maiores += 1;
            } else if (inteiros[i] < 0) {
                negativos += 1;
            }
            if (inteiros[i] % 5 == 0) {
                multiplos += 1;
            }
        }
        System.out.println("Números maiores que 15: " + maiores);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números múltiplos de 5: " + multiplos);
        System.out.println("Soma total dos números: " + soma);


        sc.close();
    }
}
