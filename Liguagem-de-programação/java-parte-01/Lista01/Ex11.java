//Ler três números inteiros distintos e exibir o maior deles.

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int Numero_um;
        int Numero_dois;
        int Numero_tres;

        System.out.print("NUMERO UM: ");
        Numero_um = sc.nextInt();
        System.out.print("NUMERO DOIS: ");
        Numero_dois = sc.nextInt();
        System.out.print("NUMERO TRES: ");
        Numero_tres = sc.nextInt();

        if (Numero_um > Numero_dois & Numero_um > Numero_tres) {
            System.out.print("Maior numero 01: " + Numero_um);
        } else if (Numero_dois > Numero_um & Numero_dois > Numero_tres) {
            System.out.print("Maior numero 02: " + Numero_dois);
        } else if (Numero_tres > Numero_um & Numero_tres > Numero_dois){
            System.out.print("Maior numero 03: " + Numero_tres);
        } else {
            System.out.print("Todos numeros iguais");
        }


    }
}
