// 1. Ler e mostrar. Ler uma matriz 3x3 de numeros inteiros e mostrar a matriz na tela em
// forma de tabela, uma linha embaixo da outra.

import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        mostrarMatriz(m);

        sc.close();
    }

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
