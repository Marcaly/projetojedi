package exercicios.java01;

/*Informar um saldo e imprimir o saldo com reajuste de 1%*/

public class Exercicio03 {
    public static void main(String[] args) {

        double saldo = 1360;
        System.out.println("Saldo = " + saldo);
        System.out.println("Saldo com reajuste = " + (saldo + saldo * 0.01));
    }
}
