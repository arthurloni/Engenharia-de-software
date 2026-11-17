// 8. Ler as notas de 10 alunos de uma turma. Contar quantos
// foram aprovados com nota maior ou igual a 6, quantos
// ficaram em recuperacao com nota maior ou igual a 4 e
// quantos foram reprovados abaixo disso.

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i           = 0;
		double nota     = 0;
		int aprovados   = 0;
		int recuperacao = 0;
		int reprovados  = 0;

		for (i = 0; i < 10; i++) {
			System.out.print("Nota do aluno " + (i + 1) + ": ");
			nota = sc.nextDouble();

			if (nota >= 6) {
				aprovados++;
			} else if (nota >= 4) {
				recuperacao++;
			} else {
				reprovados++;
			}
		}

		System.out.println("Aprovados: " + aprovados);
		System.out.println("Recuperacao: " + recuperacao);
		System.out.println("Reprovados: " + reprovados);

		sc.close();
	}
}