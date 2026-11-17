import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Saldo;
        double Limite;
        double Valor;

        System.out.print("Saldo da conta: ");
        Saldo = sc.nextDouble();

        System.out.print("Limite diário de saque: ");
        Limite = sc.nextDouble();

        System.out.print("Valor solicitado: R$ ");
        Valor = sc.nextDouble();

        if (Saldo < Valor) {
            System.out.println("Saldo insuficiente");
        } else {
            if (Valor > Limite) {
                System.out.println("Valor ultrapassa o limite diário");
            } else {
                Saldo = Saldo - Valor;
                System.out.printf("Saque efetuado");
                System.out.printf("Novo saldo: ", Saldo);
            }
        }

        sc.close();
    }
}
