/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) e armazene-os em um vetor. Ao final, imprima os números armazenados e seus sucessores. */

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(101);
        }

        System.out.print("Números aleatórios gerados: ");

        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
            
        }

        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
        
    }

}
