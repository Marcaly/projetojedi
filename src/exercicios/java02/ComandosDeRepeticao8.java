package exercicios.java02;

/*Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. */

import java.util.Scanner;

public class ComandosDeRepeticao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a idade de 20 pessoas para verificar quantas são maiores de idade: ");

        int maioresIdade = 0;
        for (int i = 0; i < 20; i++) {
            int idades = sc.nextInt();
            if (idades >= 18) {
                maioresIdade += 1;
            }
        }
        System.out.println(maioresIdade);


        sc.close();

    }
}
