// 8. Ler uma frase com as palavras separadas por um espaco e quebra-la em um array
// com split. Criar a funcao String maiorPalavra(String[] palavras) e o
// procedimento exibirPalavras(String[] palavras), que imprime uma palavra por
// linha, numerada. Imprimir tambem o total de palavras e a maior palavra.

import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] palavras = frase.trim().split(" ");

        exibirPalavras(palavras);
        System.out.println("Total de palavras: " + palavras.length);
        System.out.println("Maior palavra: " + maiorPalavra(palavras));

        sc.close();
    }
        public static String maiorPalavra(String[] palavras) {
        String maior = palavras[0];
        for (int i = 1; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }
        return maior;
    }

    public static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + ". " + palavras[i]);
        }
    }
}
