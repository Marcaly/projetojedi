package conquistas.conquista01;

/*Criar um código que declara e inicializa variáveis primitivas
 e atribuir o seu próprio valor somado a ele mesmo utilizando operadores de atribuição direta (+=, -=, *=...)*/

public class Exercicio08 {
    public static void main(String[] args) {

        int x = 57;
        x += x;
        double y = 9;
        y -= y;
        short z = 12;
        z *= z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
