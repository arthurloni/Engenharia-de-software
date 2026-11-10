// Ler quatro notas bimestrais e exibir a média aritmética do aluno.

import java.util.Scanner;

public class Ex04 {
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

        System.out.println("Média aritmética: " + MediaArtmetica);

    }
}