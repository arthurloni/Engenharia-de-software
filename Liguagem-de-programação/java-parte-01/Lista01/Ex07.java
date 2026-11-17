//Ler a base e a altura de um retângulo e exibir a área, o perímetro e a diagonal.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        double Base;
        double Altura;
        double Area;
        double Perimetro;
        double Diagonal;

        System.out.print("Base: ");
        Base = sc.nextDouble();
        System.out.print("Altura: ");
        Altura = sc.nextDouble();

        Area = Base * Altura;
        Perimetro = Base + Altura + Base + Altura;
        Diagonal = (Base* Base) + (Altura * Altura);

        System.out.println("Area: " + Area);
        System.out.println("Perimetro: " + Perimetro);
        System.out.println("Diagonal: " + Math.sqrt(Diagonal));

    }
}