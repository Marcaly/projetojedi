package exercicios.java03;

/*Escrever um algoritmo que lê:
- a percentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/

import java.util.Scanner;

public class Algoritmo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a percentagem do IPI a ser acrescido no valor das peças: ");
        double ipi = sc.nextDouble();

        System.out.println("Insira o código da primeira peça: ");
        int codigo1 = sc.nextInt();
        System.out.println("Insira o valor unitário da peça: ");
        double valor1 = sc.nextDouble();
        System.out.println("Insira a quantidade de peças: ");
        double quantidadePeca1 = sc.nextDouble();

        System.out.println("Insira o código da segunda peça: ");
        int codigo2 = sc.nextInt();
        System.out.println("Insira o valor unitário da peça: ");
        double valor2 = sc.nextDouble();
        System.out.println("Insira a quantidade de peças: ");
        double quantidadePeca2 = sc.nextDouble();

        double total = ((valor1 * quantidadePeca1 + valor2 * quantidadePeca2) * (ipi / 100 + 1));
        System.out.println("O valor total é: R$ " + total);


        sc.close();
    }
}
