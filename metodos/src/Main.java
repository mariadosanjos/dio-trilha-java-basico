public class Main {

    public static void main(String[] args) {
        
        // Calculadora
        System.out.println("=== Calculadora ===");
        Calculadora.soma(5, 3);
        Calculadora.subtracao(7, 2.5);
        Calculadora.multiplicacao(4, 6);
        Calculadora.divisao(9, 3);

        // Mensagem de acordo com a hora do dia
        System.out.println("\n=== Mensagem de acordo com a hora do dia ===");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(25);

        // Emprestimo
        System.out.println("\n=== Emprestimo ===");
        Emprestimo.calcularEmprestimo(1000, 5);
        Emprestimo.calcularEmprestimo(1000, 10);
        Emprestimo.calcularEmprestimo(1000, 15);

        // Quadriláteros
        System.out.println("\n=== Quadriláteros ===");
        Quadrilatero.area(5);
        Quadrilatero.area(4d, 6d);
        Quadrilatero.area(10, 5, 3);
        Quadrilatero.area(4f, 6f);

        // Área dos quadriláteros notáveis com métodos que retornam valores
        System.out.println("\n=== Área dos quadriláteros notáveis com métodos que retornam valores ===");
        double areaQuadrado = AreaQuadrilateros.area(5);
        double areaRetangulo = AreaQuadrilateros.area(5, 5);
        double areaTrapezio = AreaQuadrilateros.area(5, 3, 4);

        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }

}
