import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Salario;
        double Bonus;
        double Percentual;
        int TempoCasa;

        System.out.print("Salário: R$ ");
        Salario = sc.nextDouble();

        System.out.print("Tempo de casa em anos: ");
        TempoCasa = sc.nextInt();

        if (TempoCasa < 1) {
            Percentual = 0;
        } else if (TempoCasa <= 3) {
            Percentual = 5;
        } else if (TempoCasa <= 10) {
            Percentual = 10;
        } else {
            Percentual = 15;
        }

        Bonus = Salario * (Percentual / 100);

        System.out.printf("Percentual do bônus: %.2f%%%n", Percentual);
        System.out.printf("Valor do bônus: R$ %.2f%n", Bonus);

        sc.close();
    }
}