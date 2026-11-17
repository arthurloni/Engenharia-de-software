// 1. Ler a altura de 3 triangulos em um array. Criar a funcao String gerarLinha(char
// simbolo, int tamanho), que devolve o simbolo repetido tamanho vezes, e o
// procedimento desenharTriangulo(int altura), que usa a funcao para desenhar
// um triangulo de asteriscos. Para altura 3: *, **, ***. Desenhar os 3 triangulos
// separados por uma linha em branco.

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alturas = new int[3];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Altura do triangulo " + (i + 1) + ": ");
            alturas[i] = sc.nextInt();
        }

        for (int i = 0; i < alturas.length; i++) {
            desenharTriangulo(alturas[i]);
            if (i < alturas.length - 1) {
                System.out.println();
            }
        }

        sc.close();
    }

        public static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) {
            linha = linha + simbolo;
        }
        return linha;
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }
}
