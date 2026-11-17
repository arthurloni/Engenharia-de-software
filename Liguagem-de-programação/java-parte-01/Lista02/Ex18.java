import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ValorCompra;
        double Frete;
        double Total;

        System.out.print("Valor da compra: R$ ");
        ValorCompra = sc.nextDouble();

        if (ValorCompra >= 199.00) {
            Frete = 0;
        } else {
            Frete = 24.90;
        }

        Total = ValorCompra + Frete;

        System.out.printf("Valor do frete: R$ %.2f%n", Frete);
        System.out.printf("Total a pagar: R$ %.2f%n", Total);

        sc.close();
    }
}