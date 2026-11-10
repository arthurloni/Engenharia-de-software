//5. Ler dois inteiros A e B e imprimir a soma de todos os números pares no intervalo de A até B,
//incluindo os extremos. Antes do laço, verificar se A é maior que B e, nesse caso, informar que o intervalo é inválido.

import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int soma = 0;

        System.out.println("Digite o primeiro numero:");
        A = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        B = sc.nextInt();

        if (A > B) {

            System.out.println("Intervalo invalido.");

        } else {

            for (int i = A; i <= B; i++) {

                if (i % 2 == 0) {
                    soma += i;
                }
            }

            System.out.println("Soma dos numeros pares: " + soma);
        }
    }
}
