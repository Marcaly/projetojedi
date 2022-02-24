package conquistas.conquista03;

/*Criar um código que declara uma variável numérica de valor 0, e que utilizando o DO WHILE,
adicionar valor a essa variável maior que 10. Essa variável deve ser utilizada numa comparação no DO WHILE
e o código NÃO DEVE REPETIR a execução do DO WHILE.
*/
public class EstruturaRep03 {
    public static void main(String[] args) {

        int num = 0;

        do {
            num += 15;
        } while (num < 7);
        System.out.println(num);
    }
}
