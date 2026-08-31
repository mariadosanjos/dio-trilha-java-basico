/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o utilizador informe um valor válido. */

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.print("Nota inválida! Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " inserida com sucesso!");
        
        scanner.close();
    }

}
