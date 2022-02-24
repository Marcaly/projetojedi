package conquistas.conquista03;

import java.util.Scanner;

/*Criar um código que pede para o usuário inserir um valor numérico de 1 a 10,
e caso o valor digitado seja diferente desse intervalo, ele deve exibir uma mensagem
pedindo para inserir o valor correto. O PROGRAMA NÃO PODE ENCERRAR ATÉ O USUÁRIO COLOCAR O VALOR CORRETO.
*/
public class EstruturaRep02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um valor de 1 a 10: ");
        int num = sc.nextInt();

        while (num < 1 || num > 10) {
            System.out.print("Insira um número válido: ");
            num = sc.nextInt();
        }

        sc.close();
    }
}
