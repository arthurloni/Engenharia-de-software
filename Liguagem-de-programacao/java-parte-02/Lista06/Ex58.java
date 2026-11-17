// 2. Soma de todos. Ler uma matriz 3x3 de numeros inteiros e mostrar a soma de todos os
// elementos.

import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Soma: " + somarMatriz(m));

        sc.close();
    }

    public static int somarMatriz(int[][] m) {
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
        }
        return soma;
    }
}
