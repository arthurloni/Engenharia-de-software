//9. Ler um número inteiro N de 1 a 9 e imprimir as tabuadas de 1 até N,
//cada uma de 1 a 10, separando uma tabuada da outra com uma linha em branco.
//Valores fora da faixa de 1 a 9 imprimem mensagem de entrada inválida e o programa não executa os laços.

import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero de 1 a 9:");
        numero = sc.nextInt();

        if (numero < 1 || numero > 9) {

            System.out.println("Entrada invalida.");

        } else {

            for (int i = 1; i <= numero; i++) {

                for (int j = 1; j <= 10; j++) {

                    System.out.println(i + " x " + j + " = " + (i * j));
                }

                System.out.println();
            }
        }
    }
}
