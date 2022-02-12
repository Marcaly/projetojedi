package conquista02;

/*Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor qualquer,
 não atendendo em nenhum momentos as 3 condições e finalizando o fluxo no ELSE*/

public class Exercicio3 {
    public static void main(String[] args) {

        int number = 78;

        if (number >= 100) {
            System.out.println("True");
        } else if (number == 23) {
            System.out.println("True");
        } else if (number < 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
