// 9. Os codigos dos produtos sao {101, 205, 310, 420, 550} e
// os precos, na mesma ordem, {4.50, 12.00, 7.90, 25.00,
// 3.20}. Ler um codigo e imprimir o preco do produto
// correspondente. Se o codigo nao existir, imprimir que o
// produto nao foi encontrado

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};
		int[] codigos   = {101, 205, 310, 420, 550};
		int codigo      = 0;
		int i           = 0;
		boolean achou   = false;

		System.out.print("Codigo do produto: ");
		codigo = sc.nextInt();

		for (i = 0; i < 5; i++) {
			if (codigos[i] == codigo) {
				System.out.printf("Preco: %.2f%n", precos[i]);
				achou = true;
			}
		}

		if (!achou) {
			System.out.println("Produto nao encontrado");
		}

		sc.close();
	}
}