package exercicios.java03;

/*Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção escolhida
pelo usuário e calcule a média.
1 -aritmética
2 -ponderada (pesos: 3,3,4)*/

import java.util.Scanner;

public class ALgoritmo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as suas notas: ");

        double nota1 = sc.nextInt();
        double nota2 = sc.nextInt();
        double nota3 = sc.nextInt();
        double media = 0;

        System.out.println("Informe qual tipo de média deseja fazer: ");
        System.out.println("1 - Aritmética");
        System.out.println("2 - Ponderada");
        double tipo = sc.nextInt();

        if (tipo == 1) {
            System.out.println("Média aritmética = " + (nota1 + nota2 + nota3) / 3);
        }else if (tipo == 2) {
            System.out.println("Média ponderada = " + ((nota1 * 3) + (nota2 * 3) + (nota3 * 4)) / 10 );
        }


        sc.close();
    }
}
