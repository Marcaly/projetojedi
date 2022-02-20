package javaExerciciosDevDojo.javaVariaveisExc;

/*Escreva uma rotina capaz de calcular e apresentar o valor do volume de uma lata de óleo, utilize a fórmula abaixo
* V = R2A

Onde:
	V = Volume
	pi = 3.141592654
	R = Raio da circunferência da lata
	A = Altura da lata
	OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
*/

import java.util.Scanner;

public class JavaExc5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a altura da lata de óleo");
        double altura = sc.nextDouble();
        System.out.println("Entre com o raio da circunferência da lata de óleo");
        double raio = sc.nextDouble();

        System.out.println("O volume da lata de óleo é igual à: " + (3.14 * (raio * raio) * altura) + "cm³");


        sc.close();
    }
}
