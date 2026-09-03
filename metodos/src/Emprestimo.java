/*Crie uma aplicação que calcule o valor final de um empréstimo, a partir do valor solicitado. Taxas e parcelas influenciam no resultado. Defina arbitrariamente as faixas que influenciam no cálculo. */

public class Emprestimo {

    public static double getTaxa(int parcelas) {
        if (parcelas <= 6) {
            return 0.05; // 5% de taxa para até 6 parcelas
        } else if (parcelas <= 12) {
            return 0.10; // 10% de taxa para até 12 parcelas
        } else {
            return 0.15; // 15% de taxa para mais de 12 parcelas
        }
    }

    public static void calcularEmprestimo(double valorSolicitado, int parcelas) {
        double taxa = getTaxa(parcelas);

        double valorFinal = valorSolicitado + (valorSolicitado * taxa);
        System.out.println("\nValor solicitado: R$ " + valorSolicitado);
        System.out.println("Número de parcelas: " + parcelas);
        System.out.println("Taxa aplicada: " + (taxa * 100) + "%");
        System.out.println("Valor final do empréstimo: R$ " + valorFinal);
    }

}
