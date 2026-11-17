//10. Caixa de supermercado. Repetir a leitura de produtos até que o código informado seja 0.
//Para cada produto, ler o código, o preço unitário e a quantidade, acumulando o total da compra e a quantidade de itens.
//Encerrada a leitura, ler a forma de pagamento e aplicar com switch: 1 é dinheiro com 5 por cento de desconto,
//2 é débito sem alteração e 3 é crédito com 3 por cento de acréscimo.
//Formas diferentes caem no default como inválidas e o total permanece sem alteração.
//Em ifs independentes, imprimir aviso de compra grande quando o total passar de 300,00 e aviso de muitos itens quando a quantidade passar de 20.
//Imprimir o total final com duas casas.

import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        int itens = 0;
        int pagamento;
        double preco;
        double total = 0;

        System.out.println("Digite o codigo do produto ou 0 para encerrar:");
        codigo = sc.nextInt();

        while (codigo != 0) {

            System.out.println("Digite o preco unitario:");
            preco = sc.nextDouble();

            System.out.println("Digite a quantidade:");
            quantidade = sc.nextInt();

            total += preco * quantidade;
            itens += quantidade;

            System.out.println("Digite o codigo do produto ou 0 para encerrar:");
            codigo = sc.nextInt();
        }

        System.out.println("Digite a forma de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Debito");
        System.out.println("3 - Credito");

        pagamento = sc.nextInt();

        switch (pagamento) {

            case 1:
                total -= total * 0.05;
                break;

            case 2:
                break;

            case 3:
                total += total * 0.03;
                break;

            default:
                System.out.println("Forma de pagamento invalida.");
        }

        if (total > 300) {
            System.out.println("Aviso: compra grande.");
        }

        if (itens > 20) {
            System.out.println("Aviso: muitos itens.");
        }

        System.out.printf("Total final: R$ %.2f%n", total);
    }
}
