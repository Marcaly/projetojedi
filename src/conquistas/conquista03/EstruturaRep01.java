package conquistas.conquista03;

/*Criar um código que declara uma variável do tipo boolean para a condição do while
e declarar uma variável int iniciando com valor 0.
Essa variável deve ser incrementada a cada iteração do while,
e quando o valor chegar a 10, a execução do while deve parar e printar o valor no console.
*/

public class EstruturaRep01 {
    public static void main(String[] args) {

        int i = 0;
        boolean pararContagem = false;

        while (pararContagem == false){
            i++;
            if (i == 10){
               pararContagem = true;
            }
        }
        System.out.println(i);
    }
}
