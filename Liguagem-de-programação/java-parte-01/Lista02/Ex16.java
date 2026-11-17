import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Numero1;
        int Numero2;

        System.out.print("Primeiro número: ");
        Numero1 = sc.nextInt();

        System.out.print("Segundo número: ");
        Numero2 = sc.nextInt();

        if (Numero2 == 0) {
            System.out.println("A verificação não pode ser feita");
        } else {
            if (Numero1 % Numero2 == 0) {
                System.out.println("O primeiro número é múltiplo do segundo");
            } else {
                System.out.println("O primeiro número não é múltiplo do segundo");
            }
        }

        sc.close();
    }
}