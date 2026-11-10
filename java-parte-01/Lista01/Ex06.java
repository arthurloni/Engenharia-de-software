//Ler o raio de um círculo e exibir a área e o perímetro.

import java.util.Scanner;

public class Ex06    {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double Raio; // A=Pi * raio elevado a dois
        double Area;
        double Perimetro; // C = 2 * pi * raio


        System.out.print("Raio: ");
        Raio = sc.nextDouble();

        Area = 3.14 * Math.pow(Raio,2);
        Perimetro = 2 * 3.14 * Raio;

        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);


    }
}