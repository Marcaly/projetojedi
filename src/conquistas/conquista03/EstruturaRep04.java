package conquistas.conquista03;

/*Criar um código que declara uma variável do tipo String com um nome qualquer que você quiser e dentro do for, contado
até 10, o valor da variável deve ser concatenado a ela mesma sempre que encontrar um valor par na variável do índex.
Exemplo:
	1. Iteração: nome
	2. Iteração: nome, nome
	3. Iteração: nome, nome, nome
*/

public class EstruturaRep04 {
    public static void main(String[] args) {

        String nome = "Alfredo";

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(nome);
            }
        }
        System.out.println(nome);
    }
}
