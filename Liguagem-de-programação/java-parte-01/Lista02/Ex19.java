import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Hora;

        System.out.print("Hora do dia: ");
        Hora = sc.nextInt();

        if (Hora >= 0 && Hora <= 11) {
            System.out.println("Bom dia");
        } else if (Hora <= 17) {
            System.out.println("Boa tarde");
        } else if (Hora <= 23) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Hora inválida");
        }

        sc.close();
    }
}