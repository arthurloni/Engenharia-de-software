// 10. Ler N de 1 a 30. Valor fora da faixa imprime quantidade invalida e encerra.
// Preencher um array de N posicoes com a funcao recursiva int fibonacci(int n),
// em que fibonacci(0) e 0, fibonacci(1) e 1 e os demais sao a soma dos dois
// anteriores. Criar a funcao int somar(int[] v) e o procedimento exibir(int[] v).
// Para N = 10: 0 1 1 2 3 5 8 13 21 34 e soma 88.

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N (1 a 30): ");
        int n = sc.nextInt();

        if (n < 1 || n > 30) {
            System.out.println("Quantidade invalida");
            sc.close();
            return;
        }

        int[] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = fibonacci(i);
        }

        exibir(v);
        System.out.println("Soma: " + somar(v));

        sc.close();
    }

        public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
