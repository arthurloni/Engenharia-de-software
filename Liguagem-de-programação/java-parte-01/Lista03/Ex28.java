//2. Ler um número inteiro e imprimir a tabuada dele de 1 a
//10, uma linha por multiplicação, no formato 7 x 1 = 7. A
//repetição deve ser feita com while

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int i = 1;

        System.out.println("Digite um numero para ver tabuada");
        numero = sc.nextInt();

        while (true) {
            i++;
            if (i <= 10) {
                System.out.println(numero * i);
            }
            if (i > 10) {
                return;
            }
        }

    }
}