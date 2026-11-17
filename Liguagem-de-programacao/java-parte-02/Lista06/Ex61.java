// 5. Diagonal principal. Ler uma matriz 3x3 de numeros inteiros e mostrar os elementos da
// diagonal principal, que sao as posicoes em que a linha e igual a coluna: [0][0], [1][1] e [2][2].

import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
