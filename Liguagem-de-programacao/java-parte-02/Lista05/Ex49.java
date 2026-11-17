// 3. Ler 8 numeros inteiros em um array. Criar a funcao boolean ehPrimo(int
// numero), a funcao int contarPrimos(int[] v) e o procedimento
// exibirPrimos(int[] v), que imprime so os primos do array. Ao final, imprimir
// quantos primos foram encontrados.

import java.util.Scanner;

public class Ex49 {
    public static void exibirPrimos(int[] v) {
        System.out.println("Numeros primos:");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        exibirPrimos(numeros);
        System.out.println("Quantidade de primos encontrados: " + contarPrimos(numeros));

        sc.close();
    }

        public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                cont++;
            }
        }
        return cont;
    }
}
