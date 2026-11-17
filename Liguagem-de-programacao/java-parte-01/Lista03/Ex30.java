//4. Exibir um menu com as opções 1 para dobro, 2 para
//metade, 3 para quadrado e 0 para sair. Ler a opção e,
//quando ela for de 1 a 3, ler um número e aplicar a operação
//escolhida com switch. Opções fora da faixa caem no default
//como inválidas. O menu se repete até que a opção lida seja
//0.
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        int numero;

        System.out.println("Qual das opções abaixo te agrada:");
        System.out.println("0 - SAIR");
        System.out.println("1 - DOBRO");
        System.out.println("2 - METADE");
        System.out.println("3 - QUADRADO");
        opcao = sc.nextInt();

        switch (opcao) {
            case 0:
                break;
            case 1:
                System.out.println("Digite o Numero");
                numero = sc.nextInt();
                System.out.println("DOBRO: " + numero*2);
                break;
            case 2:
                System.out.println("Digite o Numero");
                numero = sc.nextInt();
                System.out.println("DOBRO: " + numero/2);
                break;
            case 3:
                System.out.println("Digite o Numero");
                numero = sc.nextInt();
                System.out.println("QUADRADO: " + numero*numero);
                break;
            default: System.out.println("Opção invalida.");
        }
    }
}