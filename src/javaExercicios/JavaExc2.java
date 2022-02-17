package javaExercicios;

/*
Baseado nas fórmulas abaixo, desenvolva uma rotina que calcule o salário líquido de um funcionário. Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado.

SB = HT * VH
TD = (PD / 100) * SB
SL = SB  - TD

Onde:
SB =  Salário Base
HT = Horas Trabalhadas
	VH = Valor Hora de trabalho
	TD = Total de Descontos
PD = Percentual de Desconto
SL = Salário Líquido
*/

import java.util.Scanner;

public class JavaExc2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        double horasTrabalhadas, valorHora, percentualDesconto;
        System.out.println("Digite as horas trabalhadas do funcionario:");
        horasTrabalhadas = sc.nextDouble();
        System.out.println("Digite o valor da hora de trabalho do funcionario:");
        valorHora = sc.nextDouble();
        System.out.println("Digite o percentual de desconto do salario do funcionario:");
        percentualDesconto = sc.nextDouble();

        double salarioBase = horasTrabalhadas * valorHora;
        double totalDesconto = (percentualDesconto / 100) * salarioBase;
        double salarioLiquido = salarioBase - totalDesconto;

        System.out.println("O salario base do funcionario é igual à: R$" + horasTrabalhadas * valorHora);
        System.out.println("O salario liquido do funcionario é igual à: R$" + (salarioBase - totalDesconto));

        sc.close();
    }
}
