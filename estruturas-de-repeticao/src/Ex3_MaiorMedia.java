/*Faça um programa que leia 5 números e informe o maior número e a média desses números. */

import java.util.Scanner;

public class Ex3_MaiorMedia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;
        int media;

        System.out.println("Este programa lê 5 números e informa o maior número e a média desses números.");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            soma += numero;
            contador++;
        } while (contador < 5);

        scanner.close();
        System.out.println("O maior número é: " + maior);
        media = soma / 5;
        System.out.println("A média dos números é: " + media);
    }

}
