import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero;
        int Modulo;

        System.out.print("Número inteiro: ");
        Numero = sc.nextInt();

        Modulo = Math.abs(Numero);

        if (Numero > 0) {
            System.out.println("É positivo");
        }

        if (Numero % 2 == 0) {
            System.out.println("É par");
        }

        if (Numero % 5 == 0) {
            System.out.println("É múltiplo de 5");
        }

        if (Modulo >= 10 && Modulo <= 99) {
            System.out.println("Tem dois dígitos");
        }

        sc.close();
    }
}