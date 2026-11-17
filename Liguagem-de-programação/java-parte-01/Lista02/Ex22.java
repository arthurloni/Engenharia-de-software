import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Usuario;
        String Senha;

        System.out.print("Usuário: ");
        Usuario = sc.nextLine();

        System.out.print("Senha: ");
        Senha = sc.nextLine();

        if (!Usuario.equals("admin")) {
            System.out.println("Usuário não encontrado");
        } else {
            if (Senha.equals("java123")) {
                System.out.println("Acesso liberado");
            } else {
                System.out.println("Senha incorreta");
            }
        }

        sc.close();
    }
}