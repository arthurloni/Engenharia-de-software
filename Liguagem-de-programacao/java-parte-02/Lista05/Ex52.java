// 6. Ler 3 frases em um array de String. Criar a funcao int contarVogais(String
// texto), sem diferenciar maiuscula de minuscula, e o procedimento
// exibirContagem(String[] frases), que imprime cada frase com sua quantidade
// de vogais e, ao final, a frase com mais vogais.

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);

        sc.close();
    }

        public static int contarVogais(String texto) {
        String minusculo = texto.toLowerCase();
        int cont = 0;
        for (int i = 0; i < minusculo.length(); i++) {
            char c = minusculo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public static void exibirContagem(String[] frases) {
        int maiorQtd = contarVogais(frases[0]);
        String fraseMaisVogais = frases[0];

        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println("Frase " + (i + 1) + ": " + frases[i] + " - " + qtd + " vogais");
            if (qtd > maiorQtd) {
                maiorQtd = qtd;
                fraseMaisVogais = frases[i];
            }
        }

        System.out.println("Frase com mais vogais: " + fraseMaisVogais + " (" + maiorQtd + " vogais)");
    }

}
