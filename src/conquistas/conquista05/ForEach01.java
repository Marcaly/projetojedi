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

        String variaveis[] = {"Casa", "Cavalo", "Produto", "Relógio", "Comida", "Buraco", "Mouse", "Trabalho", "9",
                "10 "};

        String concatenar = " ";
        for (String variavel : variaveis) {
            concatenar += " " + variavel;
            System.out.println(concatenar);
        }


    }
}
