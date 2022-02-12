package conquista02;

/*Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
 sendo atendida na segunda condição, não executando a terceira e nem um ELSE*/


public class Exercicio4 {
    public static void main(String[] args) {

        int number = 30;

        if (number == 7) {
            System.out.println("True");
        } else if (number >= 23) {
            System.out.println("True");
        } else if (number <= 12) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

