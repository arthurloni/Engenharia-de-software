// Ler um valor em reais e a cotação do dólar e exibir o valor convertido.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double ValorReais;
        double Dolar;

        System.out.print("Valor para ser convertido: ");
        ValorReais = sc.nextDouble();
        System.out.print("Cotação do dolar: ");
        Dolar = sc.nextDouble();

        System.out.println("Valor da conversão (REAL):  " + ValorReais * Dolar);
        System.out.println("Valor da conversão (DOLAR): " + ValorReais / Dolar);

    }
}