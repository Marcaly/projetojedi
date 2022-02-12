package conquista01;
        /*Criar um código que compara valores iguais, maiores e menores para variáveis de tipos diferentes.
    Ex: int numero1 = 20; long numero2 = 20; numero1 == numero2. (utilizar: int, long, double, float e short)*/

public class Exercicio06 {
    public static void main(String[] args) {


        int number1 = 7;
        double number2 = 2913;
        float number3 = 23.42f;
        long number4 = 2345;
        short number5 = 12;

        System.out.println(number1 == number5);
        System.out.println(number2 > number4);
        System.out.println(number3 < number2);
        System.out.println(number4 >= number5);
        System.out.println(number5 <= number1);
    }
}
