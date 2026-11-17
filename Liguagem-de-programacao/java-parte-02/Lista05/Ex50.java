// 4. Ordenacao pelo metodo da bolha. Ler 6 numeros inteiros em um array. Criar o
// procedimento ordenar(int[] v), que coloca o array em ordem crescente
// comparando vizinhos e trocando quando estiverem fora de ordem, a funcao
// boolean estaOrdenado(int[] v) e o procedimento exibir(int[] v). Imprimir o
// array e o resultado de estaOrdenado antes e depois de ordenar.

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Antes de ordenar: ");
        exibir(numeros);
        System.out.println("Esta ordenado: " + estaOrdenado(numeros));

        ordenar(numeros);

        System.out.print("Depois de ordenar: ");
        exibir(numeros);
        System.out.println("Esta ordenado: " + estaOrdenado(numeros));

        sc.close();
    }

        public static void ordenar(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

}
