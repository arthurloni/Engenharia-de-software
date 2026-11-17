// 7. Ler o salário de 6 funcionários. Imprimir o maior salário, o
// menor salário, a média com duas casas e quantos
// funcionários ganham acima da média.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double[] salarios = new double[6];

        int acima = 0;

		double soma  = 0;
		double media = 0;
        double maior = 0;
        double menor = 0;
		
		for (int i = 0; i < 6; i++) {
			System.out.print("Salario " + (i + 1) + ": ");
			salarios[i] = sc.nextDouble();
			soma += salarios[i];
		}

		maior = salarios[0];
		menor = salarios[0];

		for (int i = 1; i < 6; i++) {
			if (salarios[i] > maior) {
				maior = salarios[i];
			}
			if (salarios[i] < menor) {
				menor = salarios[i];
			}
		}

		media = soma / 6;

		acima = 0;
		for (int i = 0; i < 6; i++) {
			if (salarios[i] > media) {
				acima++;
			}
		}

		System.out.printf("Maior: %.2f%n", maior);
		System.out.printf("Menor: %.2f%n", menor);
		System.out.printf("Media: %.2f%n", media);
		System.out.println("Acima da media: " + acima);

		sc.close();
	}
}