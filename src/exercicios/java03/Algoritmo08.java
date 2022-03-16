package exercicios.java03;

/*Escreva um algoritmo para ler o número total de eleitores de um município, o número
de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
representa em relação ao total de eleitores.*/

import java.util.Scanner;

public class Algoritmo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores no município: ");
        double eleitores = sc.nextDouble();

        System.out.println("Insira o total de votos em branco");
        double votosBrancos = sc.nextDouble() * 100 / eleitores;


        System.out.println("Insira o total de votos nulos");
        double votosNulos = sc.nextDouble() * 100 / eleitores;

        System.out.println("Insira o total de votos válidos");
        double votosValidos = sc.nextDouble() * 100 / eleitores;

        System.out.println("Total de eleitores: " + eleitores + "%");
        System.out.println("Votos em branco: " + votosBrancos + "%");
        System.out.println("Votos nulos: " + votosNulos + "%");
        System.out.println("Votos válidos: " + votosValidos + "%");

        sc.close();
    }
}
