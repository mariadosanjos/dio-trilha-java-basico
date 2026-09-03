/*Crie uma aplicação que realize as 4 operações matemáticas básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados como parâmetros. */

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("O resultado da soma de " + numero1 + " + " + numero2 + " é: " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("O resultado da subtração de " + numero1 + " - " + numero2 + " é: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("O resultado da multiplicação de " + numero1 + " * " + numero2 + " é: " + resultado);
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("O resultado da divisão de " + numero1 + " / " + numero2 + " é: " + resultado);
    }

}
