package conquistas.conquista02;

/*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é igual ao case (a, b, c e default).
 O código deve executar apenas o default com a mensagem: “O valor não é compatível”.*/


public class Exercicio6 {
    public static void main(String[] args) {

        char var = 'd';
        switch (var) {
            case 'a':
                System.out.println("Case A");
                break;
            case 'b':
                System.out.println("Case B");
                break;
            case 'c':
                System.out.println("Case C");
                break;
            default:
                System.out.println("the value is not compatible");

        }
    }
}
