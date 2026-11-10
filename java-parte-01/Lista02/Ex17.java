import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ano;

        System.out.print("Ano: ");
        Ano = sc.nextInt();

        if ((Ano % 4 == 0 && Ano % 100 != 0) || Ano % 400 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }

        sc.close();
    }
}