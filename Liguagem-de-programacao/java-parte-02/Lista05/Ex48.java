// 2. Ler o peso e a altura de 4 pessoas em dois arrays. Criar as funcoes double
// calcularImc(double peso, double altura) e String classificarImc(double
// imc), que devolve Abaixo do peso (menor que 18,5), Peso normal (menor que 25),
// Sobrepeso (menor que 30) ou Obesidade. Criar o procedimento
// exibirRelatorio(double[] pesos, double[] alturas), que imprime uma linha
// por pessoa no formato Pessoa 1: IMC 22,86 - Peso normal.

import java.util.Scanner;

public class Ex48 {
    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            String classificacao = classificarImc(imc);
            System.out.printf("Pessoa %d: IMC %.2f - %s%n", i + 1, imc, classificacao);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Peso da pessoa " + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();
            System.out.print("Altura da pessoa " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
        }

        exibirRelatorio(pesos, alturas);

        sc.close();
    }

        public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
