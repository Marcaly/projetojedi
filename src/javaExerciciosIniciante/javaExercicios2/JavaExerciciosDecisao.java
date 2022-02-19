package javaExerciciosIniciante.javaExercicios2;

/*Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4)
  e informe o status do aluno baseado na tabela abaixo:

        Média
        Status
        Se a média for menor que 50
        REPROVADO
        Se a média for igual a 50
        RECUPERAÇÃO
        Se a média for maior que 50
        APROVADO
*/

import java.util.Scanner;

public class JavaExerciciosDecisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as notas dos 4 bimestres: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();

        if ((n1 + n2 + n3 + n4) / 4 < 50){
            System.out.println("REPROVADO");
        }else if ((n1 + n2 + n3 + n4) / 4 == 50){
            System.out.println("RECUPERAÇÃO");
        }else {
            System.out.println("APROVADO");
        }


        sc.close();
    }
}
