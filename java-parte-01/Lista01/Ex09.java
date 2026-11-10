//Ler um número inteiro e informar se ele é par ou ímpar.

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int Numero;
        double Calc;

        System.out.print("Numero: ");
        Numero = sc.nextInt();

        if (Numero % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

    }
}