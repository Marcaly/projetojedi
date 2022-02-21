package exercicios.java02;

/*Leia o nome do usuário e escreva o nome dele na tela 10 vezes. */

import java.util.Scanner;

public class ComandosDeRepeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o nome de usuário: ");
        String user = sc.next();

        for(int i = 0; i < 10; i++){
            System.out.println(user);
        }

        sc.close();
    }
}
