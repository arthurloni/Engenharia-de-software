//6 - Ler o valor de um empréstimo e a taxa de juros simples
//mensal em porcentagem. Preencher um array de 12

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] divMes = new double[12];

        System.out.print("Valor do empréstimo: R$ ");
        double vlrEmp = sc.nextDouble();

        System.out.print("Taxa de juros simples mensal (%): ");
        double taxa = sc.nextDouble();

        double jurosMes = vlrEmp * (taxa / 100.0);

        for (int i = 0; i < divMes.length; i++) {
            divMes[i] = vlrEmp + (jurosMes * (i + 1));
            System.out.println("Mês: " + (i + 1) + divMes[i]);
        }
        sc.close();
    }
}