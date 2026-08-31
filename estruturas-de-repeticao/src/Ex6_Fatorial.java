/*Faça um programa que calcule o fatorial de um número fornecido pelo utilizador. 
Ex.: 5! = 5 x 4 x 3 x 2 x 1 = 120
*/

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            
        }
        System.out.println(numero + "! = " + fatorial);
        scanner.close();
    }

}
