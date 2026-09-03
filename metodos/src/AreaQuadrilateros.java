/*Recrie a aplicação que calcule a área dos 3 quadriláteros notáveis: quadrado, retângulo e trapézio. Agora faça os métodos retornarem valores */

public class AreaQuadrilateros {

    public static double area(double lado) {
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

}
