// 10. Caixa de loja. Ler a quantidade N de itens da compra. Se
// N for menor que 1, imprimir mensagem de quantidade
// invalida e encerrar. Caso contrario, ler o preco unitario e a
// quantidade de cada item em dois arrays de tamanho N.
// Imprimir o subtotal de cada item, o total da compra, um
// desconto de 5 por cento quando o total passar de 200,00 e o
// valor final a pagar, todos com duas casas

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] precos   = 0;
		int[] quantidades = 0;
		int n             = 0;
		int i             = 0;
		double subtotal   = 0;
		double total      = 0;
		double desconto   = 0;
		double valorFinal = 0;

		System.out.print("Quantidade de itens: ");
		n = sc.nextInt();

		if (n < 1) {
			System.out.println("Quantidade invalida");
			return;
		}

		precos = new double[n];
		quantidades = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Preco do item " + (i + 1) + ": ");
			precos[i] = sc.nextDouble();
			System.out.print("Quantidade do item " + (i + 1) + ": ");
			quantidades[i] = sc.nextInt();
		}

		for (i = 0; i < n; i++) {
			subtotal = precos[i] * quantidades[i];
			total += subtotal;
			System.out.printf("Subtotal item %d: %.2f%n", i + 1, subtotal);
		}

		if (total > 200) {
			desconto = total * 0.05;
		}

		valorFinal = total - desconto;

		System.out.printf("Total: %.2f%n", total);
		System.out.printf("Desconto: %.2f%n", desconto);
		System.out.printf("Valor final: %.2f%n", valorFinal);

		sc.close();
	}
}