package conquistas.conquista05;

/*Criar um array do tipo String de 10 posições e inicializar.
Para cada iteração do for, o valor da posição deve ser concatenado ao valor da variável ex:
Nome
Nome nome
Nome nome casa
*/

import java.util.Scanner;

public class ForEach01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String variaveis[] = new String[10];
        String concatenar = " ";

        System.out.println("Entre com 10 variáveis para concatená-las");

        for (String variavel : variaveis) {
            variavel = sc.next();
            concatenar += " " + variavel;
        }
        System.out.println(concatenar);


        sc.close();
    }
}
