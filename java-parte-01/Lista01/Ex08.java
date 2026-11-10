//Ler uma temperatura em graus Celsius e convertê-la para Fahrenheit e para Kelvin.

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double Graus;
        double Fahre;
        double Kelvin;

        System.out.print("Graus: ");
        Graus = sc.nextDouble();

        Fahre = (Graus * 1.8) + 32;
        Kelvin = Graus +  273.15;


        System.out.println("Graus: " + Graus);
        System.out.println("Fahrenheit: " + Fahre);
        System.out.println("Kelvin: " + Kelvin);

    }
}