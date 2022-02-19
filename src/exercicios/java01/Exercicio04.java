package exercicios.java01;

/*Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a porcentagem do imposto a ser acrescido no valor das peças: ");
        double ipi = sc.nextDouble();

        System.out.print("Insira o codigo da TV: ");
        int codigo1 = sc.nextInt();

        System.out.print("Insira o valor da TV: ");
        double valor1 = sc.nextDouble();

        System.out.print("Insira a quantidade de TV's desejadas: ");
        int quant1 = sc.nextInt();
        System.out.println();

        System.out.print("Insira o codigo do Marea turbo: ");
        int codigo2 = sc.nextInt();

        System.out.print("Insira o valor unitário do Marea turbo : ");
        double valor2 = sc.nextDouble();

        System.out.print("Insira a quantidade de Mareas turbo: ");
        int quant2 = sc.nextInt();
        System.out.println();

        double valorTotal = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.println("Codigo da TV: " + codigo1 + " ||  Valor da TV: R$" + valor1 + " ||  Quantidade de TVs: "
                + quant1);
        System.out.println();

        System.out.println("Codigo do Marea turbo: " + codigo2 + " ||  Valor do Marea turbo: R$" + valor2
                + " ||  Quantidade de Mareas turbo: " + quant2);
        System.out.println();

        System.out.printf("Valor total dos itens: R$%.2f", valorTotal);


        sc.close();
    }
}
