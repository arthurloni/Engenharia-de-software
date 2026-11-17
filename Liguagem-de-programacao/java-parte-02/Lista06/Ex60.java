// 4. Contar pares. Ler uma matriz 2x3 (2 linhas e 3 colunas) de numeros inteiros e mostrar
// quantos numeros pares foram digitados.

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[2][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Quantidade de pares: " + contarPares(m));

        sc.close();
    }

    public static int contarPares(int[][] m) {
        int pares = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        return pares;
    }
}
