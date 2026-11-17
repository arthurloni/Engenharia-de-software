// 9. Ler um expoente e 5 bases em um array. Criar a funcao recursiva long
// potencia(int base, int expoente), sem Math.pow e sem laco. Caso base:
// expoente 0 devolve 1. Criar o procedimento exibirPotencias(int[] bases, int
// expoente), que imprime no formato 2^3 = 8.

import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Expoente: ");
        int expoente = sc.nextInt();

        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) {
            System.out.print("Base " + (i + 1) + ": ");
            bases[i] = sc.nextInt();
        }

        exibirPotencias(bases, expoente);

        sc.close();
    }

        public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            System.out.println(bases[i] + "^" + expoente + " = " + potencia(bases[i], expoente));
        }
    }

}
