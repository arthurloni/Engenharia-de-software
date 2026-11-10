//3. Ler uma nota até que o valor informado esteja entre 0 e
//10. Enquanto estiver fora da faixa, imprimir mensagem de
//valor inválido e ler novamente. Ao final, imprimir a nota
//aceita.

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        do {
            System.out.print("Digite uma nota (entre 0 e 10): ");
            nota = sc.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! Tente novamente.");
            }

        } while (nota < 0 || nota > 10); 
            System.out.println("Nota aceita: " + nota);
    }
}