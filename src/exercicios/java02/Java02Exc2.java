package exercicios.java02;

/*) Escreva um algoritmo que calcule a soma dos números de 1 a 15. */

public class Java02Exc2 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma = i + soma;
        }
        System.out.println(soma);
    }
}
