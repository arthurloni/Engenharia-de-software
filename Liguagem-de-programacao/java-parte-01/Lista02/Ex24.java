import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Numero1;
        double Numero2;
        double Resultado;
        int Opcao;

        System.out.print("Primeiro número: ");
        Numero1 = sc.nextDouble();

        System.out.print("Segundo número: ");
        Numero2 = sc.nextDouble();

        System.out.print("Opção: ");
        Opcao = sc.nextInt();

        switch (Opcao) {
            case 1 -> {
                Resultado = Numero1 + Numero2;
                System.out.printf("Resultado: %.2f%n", Resultado);
            }
            case 2 -> {
                Resultado = Numero1 - Numero2;
                System.out.printf("Resultado: %.2f%n", Resultado);
            }
            case 3 -> {
                Resultado = Numero1 * Numero2;
                System.out.printf("Resultado: %.2f%n", Resultado);
            }
            case 4 -> {
                if (Numero2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    Resultado = Numero1 / Numero2;
                    System.out.printf("Resultado: %.2f%n", Resultado);
                }
            }
            default -> System.out.println("Opção inválida");
        }

        sc.close();
    }
}