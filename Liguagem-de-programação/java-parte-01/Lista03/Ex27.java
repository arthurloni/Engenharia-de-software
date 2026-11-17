//1. Ler um número inteiro N e imprimir todos os valores de 1
//até N, um por linha. Se N for menor que 1, imprimir que não
//há valores a exibir e encerrar sem entrar no laço.

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero para ver sua sequecia, (Digito 1, para encerrar a sequencia.)");
        numero = sc.nextInt();

        if (numero > 1) {
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Sequencia encerrada.");
        }
    }
}