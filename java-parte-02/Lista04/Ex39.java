//3 - Ler as 4 notas de um aluno. Imprimir a média com duas
//casas e a situação: aprovado com média maior ou igual a 6 e
//reprovado abaixo disso.

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite sua nota: " + (i+1) + "°");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.println("Média:" + media);

        if (media >= 6.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        sc.close();
    }
}