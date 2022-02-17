package javaExercicios;

/*Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, desenvolva o cálculo utilizando a fórmula abaixo:

	D=TV
	LU=D  12

	Onde:
		D = Distância em Km
		T = Tempo gasto na viagem
		V = Velocidade
*/

import java.util.Scanner;

public class JavaExc6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Litros de combustivel ?
        autonomia = 12 km / Litro
         */

        System.out.println("Insira a distancia do trajeto em km: ");
        int distancia = sc.nextInt();




        sc.close();
    }
}
