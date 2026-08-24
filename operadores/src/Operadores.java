public class Operadores {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        // Operadores Aritméticos
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int restoDivisao = numero1 % numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da Divisão: " + restoDivisao);

        // Operadores Relacionais
        boolean maiorQue = numero1 > numero2;
        boolean menorQue = numero1 < numero2;
        boolean igualA = numero1 == numero2;
        boolean diferenteDe = numero1 != numero2;

        System.out.println("Maior que: " + maiorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Igual a: " + igualA);
        System.out.println("Diferente de: " + diferenteDe);

        // Operadores Lógicos
        boolean e = (numero1 > 5) && (numero2 < 30);
        boolean ou = (numero1 < 5) || (numero2 < 30);
        boolean nao = !(numero1 > 5);

        System.out.println("E: " + e);
        System.out.println("Ou: " + ou);
        System.out.println("Não: " + nao);

        // Operadores ternários
        String resultado = (numero1 > numero2) ? "Número 1 é maior" : "Número 2 é maior";
        System.out.println("Resultado: " + resultado);
    }

}
