import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Idade;

        System.out.print("Idade: ");
        Idade = sc.nextInt();

        if (Idade >= 16) {
            System.out.println("Pode votar");
        }

        if (Idade >= 18) {
            System.out.println("Pode dirigir");
        }

        if (Idade >= 60) {
            System.out.println("É idoso");
        }

        sc.close();
    }
}