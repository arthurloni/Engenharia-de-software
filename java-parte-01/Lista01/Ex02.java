//Ler dois números inteiros e exibir a soma, a subtração, o produto, a divisão inteira e o resto da divisão.

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int Numero_um;
        int Numero_dois;
        int Soma;
        int Sub;
        int Prod;
        int Div;
        int Resto;

        System.out.print("NUMERO UM: ");
        Numero_um = sc.nextInt();
        System.out.print("NUMERO DOIS: ");
        Numero_dois = sc.nextInt();

        Soma = Numero_um + Numero_dois;
        Sub = Numero_um - Numero_dois;
        Prod = Numero_um * Numero_dois;
        Div = Numero_um / Numero_dois;
        Resto = Numero_um % Numero_dois;

        if (Numero_um < Numero_dois) {
            Sub = Numero_dois - Numero_um;
        }

        System.out.println("SOMA DE DOIS NUMEROS: " + Soma);
        System.out.println("SUBTRAÇÃO DE DOIS NUMEROS: " + Sub);
        System.out.println("PRODUTO: " + Prod);
        System.out.println("DIVISÃO: " + Div);
        System.out.println("RESTO DA DIV: " + Resto);

    }
}
