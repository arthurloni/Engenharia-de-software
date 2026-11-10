// Ler a média final de um aluno e classificá-la: média maior ou igual a 7 resulta em
//aprovado, média entre 5 e 7 resulta em recuperação, e média abaixo de 5 resulta em
//reprovado.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double Nota01;
        double Nota02;
        double Nota03;
        double Nota04;
        double MediaArtmetica;

        System.out.print("Nota 01: ");
        Nota01 = sc.nextDouble();
        System.out.print("Nota 02: ");
        Nota02 = sc.nextDouble();
        System.out.print("Nota 03: ");
        Nota03 = sc.nextDouble();
        System.out.print("Nota 04: ");
        Nota04 = sc.nextDouble();

        MediaArtmetica = (Nota01 + Nota02 + Nota03 + Nota04) / 4;

        if (MediaArtmetica >= 7) {
            System.out.println("Aprovado");
        } else if (MediaArtmetica >= 5 && MediaArtmetica < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Média aritmética: " + MediaArtmetica);

    }
}