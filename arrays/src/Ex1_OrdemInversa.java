/*Crie um vetor de 6 números inteiros e imprima-os da ordem inversa. */

public class Ex1_OrdemInversa {

    public static void main(String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int contador = 0;

        System.out.println("Vetor na ordem normal: ");
        while (contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.println("\nVetor na ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}
