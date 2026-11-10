//7. Ler a quantidade de alunos de uma turma e, em seguida, a nota de cada aluno.
//Ao final, imprimir a média da turma com duas casas, quantos alunos ficaram com nota maior ou igual a 6
//e quantos ficaram abaixo disso.

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantidade;
        int aprovados = 0;
        int reprovados = 0;
        double nota;
        double soma = 0;
        double media;

        System.out.println("Digite a quantidade de alunos:");
        quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            System.out.println("Digite a nota do aluno " + i + ":");
            nota = sc.nextDouble();

            soma += nota;

            if (nota >= 6) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        media = soma / quantidade;

        System.out.printf("Media da turma: %.2f%n", media);
        System.out.println("Alunos com nota maior ou igual a 6: " + aprovados);
        System.out.println("Alunos com nota abaixo de 6: " + reprovados);
    }
}
