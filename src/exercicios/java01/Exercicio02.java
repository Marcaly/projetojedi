package exercicios.java01;

/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
números 4, 5 e 6. A soma das duas médias. A média das médias*/

public class Exercicio02 {
    public static void main(String[] args) {

        double media1 = (8 + 9 + 7) / 3;
        double media2 = (4 + 5 + 6) / 3;

        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media1 + media2);
        System.out.println((media1 + media2) / 2);


    }
}
