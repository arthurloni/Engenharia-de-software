//5 -  Ler o preço de 5 produtos. Criar um segundo array com o
//preço de cada produto com 10 por cento de desconto.
//Imprimir, uma linha por produto, o preço original e o preço
//com desconto.

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[5];
        double[] precoSegundario = new double[5];

        for (int i = 0; i < preco.length;i++) {
            System.out.println("Produto"+(i+1)+": ");
            preco[i] = sc.nextDouble();
            precoSegundario[i] = preco[i] - (preco[i] * 0.1);
        }

        for (int j = 0; j < preco.length;j++) {
            System.out.println("Preco original: " + preco[j] + " ,Preco com desconto: " + precoSegundario[j]);
        }

        sc.close();
    }
}