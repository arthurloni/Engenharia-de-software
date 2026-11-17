// 5. Decimal para binario. Ler 5 numeros inteiros nao negativos em um array. Criar a
// funcao String paraBinario(int n), que monta o binario por divisoes sucessivas
// por 2 (o resto vai a esquerda do que ja foi montado), e o procedimento
// exibirTabela(int[] v), que imprime uma linha por numero no formato 10 = 1010.

import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        exibirTabela(numeros);

        sc.close();
    }
        public static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }
        String binario = "";
        while (n > 0) {
            int resto = n % 2;
            binario = resto + binario;
            n = n / 2;
        }
        return binario;
    }

    public static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }
}
