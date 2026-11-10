//8. Ler valores inteiros até que o usuário digite 0. O valor 0 encerra a leitura e não entra nos cálculos.
//Ao final, imprimir a quantidade de valores lidos, a soma, o maior e o menor.
//Se o primeiro valor digitado for 0, imprimir que nenhum valor foi lido.

import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int quantidade = 0;
        int soma = 0;
        int maior = 0;
        int menor = 0;

        System.out.println("Digite um numero:");
        numero = sc.nextInt();

        while (numero != 0) {

            if (quantidade == 0) {
                maior = numero;
                menor = numero;
            }

            soma += numero;
            quantidade++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            System.out.println("Digite outro numero ou 0 para encerrar:");
            numero = sc.nextInt();
        }

        if (quantidade == 0) {

            System.out.println("Nenhum valor foi lido.");

        } else {

            System.out.println("Quantidade de valores: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }
    }
}
