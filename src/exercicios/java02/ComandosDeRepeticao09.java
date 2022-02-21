package exercicios.java02;

/*Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova*/


import java.util.Scanner;

public class ComandosDeRepeticao09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome[] = new String[4];
        int idade[] = new int[4];
        int i;
        System.out.println("Insira o nome e a idade de 10 pessoas para verificarmos quem é a pessoa mais nova: ");
        int menorIdade = 1000000;
        String nomeMenor = "";
        for (i = 0; i < idade.length; i++) {
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            if (idade[i] < menorIdade) {
                menorIdade = idade[i];
                nomeMenor = nome[i];
            }

        }
        System.out.println("Pessoa mais nova: " + nomeMenor + " Idade: " + menorIdade);

    }
}
