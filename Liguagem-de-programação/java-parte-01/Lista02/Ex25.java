import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Mes;

        System.out.print("Número do mês: ");
        Mes = sc.nextInt();

        switch (Mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 dias");
            case 4, 6, 9, 11 -> System.out.println("30 dias");
            case 2 -> System.out.println("28 dias");
            default -> System.out.println("Mês inválido");
        }

        sc.close();
    }
}