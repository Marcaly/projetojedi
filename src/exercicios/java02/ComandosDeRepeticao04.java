package exercicios.java02;

/*Leia o nome um número do usuário um número N e escreva o nome dele na tela N
vezes. */

import java.util.Scanner;

public class ComandosDeRepeticao04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome de usuário: ");
        String user = sc.next();
        System.out.print("Quantas vezes deseja repetir o nome do usuário? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(user);
        }

        sc.close();
    }
}
