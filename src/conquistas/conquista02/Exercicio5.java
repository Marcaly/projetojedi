package conquistas.conquista02;

/*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (1, 2, 3).
 Os cases devem escrever quando o valor for igual ao seu próprio. Mostrando apenas a frase do case referente ao valor.*/


public class Exercicio5 {
    public static void main(String[] args) {

        int number = 2;

        switch (number) {
            case 1:
                System.out.println("Number 1");
                break;
            case 2:
                System.out.println("Number 2");
                break;
            case 3:
                System.out.println("Number 3");
                break;
        }
    }
}
