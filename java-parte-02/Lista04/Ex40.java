//4 -  Ler o preço de 5 produtos. Imprimir todos os preços lidos
//e, ao final, o total da compra com duas casas.

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[5];

        double vlr = 0;

        for (int i = 0; i < preco.length;i++) {
            System.out.println("Produto"+(i+1)+": ");
            preco[i] = sc.nextDouble();
            System.out.println("Total: " + (vlr+=preco[i]));
        }

        sc.close();
    }
}