/*Faça um gerador de tabuada, capaz de gerar a tabuada de qualquer número entre 1 e 10. O utilizador deve informar qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada do 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
*/

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }

}
