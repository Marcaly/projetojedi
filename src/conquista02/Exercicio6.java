package conquista02;

/*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
 O código deve executar apenas o default com a mensagem: “O valor não é compatível”.*/


public class Exercicio6 {
    public static void main(String[] args) {

        int number = 78;
        switch (number) {
            case 45:
                System.out.println("Number 45");
                break;
            case 77:
                System.out.println("Number 77");
                break;
            case 98:
                System.out.println("Number 98");
                break;
            default:
                System.out.println("the value is not compatible");
        }
    }
}
