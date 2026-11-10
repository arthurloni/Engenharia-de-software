//6. Ler um número inteiro não negativo e calcular o fatorial dele com um acumulador iniciado em 1.
//Considerar que o fatorial de 0 vale 1. Valores negativos devem imprimir mensagem de entrada inválida.

import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        long fatorial = 1;

        System.out.println("Digite um numero para calcular o fatorial:");
        numero = sc.nextInt();

        if (numero < 0) {

            System.out.println("Entrada invalida.");

        } else {

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println("Fatorial: " + fatorial);
        }
    }
}
