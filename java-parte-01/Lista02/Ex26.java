import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TipoVeiculo;
        int Horas;
        double Tarifa;
        double Valor;
        String Cupom;

        System.out.print("Tipo de veículo (1 - Carro / 2 - Moto): ");
        TipoVeiculo = sc.nextInt();

        switch (TipoVeiculo) {
            case 1 -> Tarifa = 8.00;
            case 2 -> Tarifa = 5.00;
            default -> Tarifa = 0;
        }

        if (Tarifa == 0) {
            System.out.println("Opção inválida");
        } else {
            System.out.print("Quantidade de horas: ");
            Horas = sc.nextInt();

            Valor = Horas * Tarifa;

            sc.nextLine();

            System.out.print("Possui cupom? (sim/nao): ");
            Cupom = sc.nextLine();

            if (Cupom.equalsIgnoreCase("sim")) {
                if (Valor >= 50.00) {
                    Valor = Valor * 0.80;
                    System.out.println("Desconto de 20% aplicado");
                } else {
                    System.out.println("O cupom vale apenas para valores de 50,00 ou mais");
                }
            }

            if (Horas > 12) {
                System.out.println("Aviso: permanência longa");
            }

            if (Horas > 24) {
                System.out.println("Aviso: cobrança de diária");
            }

            if (Horas <= 2) {
                System.out.println("Permanência curta");
            } else if (Horas <= 6) {
                System.out.println("Permanência média");
            } else {
                System.out.println("Permanência longa");
            }

            System.out.printf("Valor final: R$ %.2f%n", Valor);
        }

        sc.close();
    }
}