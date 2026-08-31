/*Faça  um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares. */

import java.util.Scanner;

public class Ex4_ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        System.out.print("Digite a quantidade de números inteiros que deseja informar: ");
        quantidade = scanner.nextInt();

        int contador = 0;
        int pares = 0;
        int impares = 0;

        do {
            System.out.print("Digite o " + (contador + 1) + "º número inteiro: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            contador++;
        } while (contador < quantidade);

        System.out.print("Quantidade de números pares: " + pares);
        System.out.print("\nQuantidade de números ímpares: " + impares);

        scanner.close();
    }

}
