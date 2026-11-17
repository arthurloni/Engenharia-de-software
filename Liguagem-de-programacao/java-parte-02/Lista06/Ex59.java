// 3. Maior valor. Ler uma matriz 3x3 de numeros inteiros e mostrar o maior valor digitado.

import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Maior valor: " + encontrarMaior(m));

        sc.close();
    }

    public static int encontrarMaior(int[][] m) {
        int maior = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        return maior;
    }
}
