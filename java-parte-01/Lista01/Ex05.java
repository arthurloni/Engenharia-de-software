// 5. Ler o valor da hora trabalhada e a quantidade de horas do mês. Calcular o salário
//bruto, o desconto de 8 por cento de INSS e o salário líquido.

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        int HoraTrabalhada;
        int QtdHorasMes;
        double SalarioBruto;
        double SalarioLiquido;


        System.out.print("Valor Horas Trabalhada: ");
        HoraTrabalhada = sc.nextInt();
        System.out.print("Quantidade de horas trabalhada mes: ");
        QtdHorasMes = sc.nextInt();

        SalarioBruto = HoraTrabalhada * QtdHorasMes;
        SalarioLiquido = SalarioBruto * 0.8;

        System.out.println("Salario Bruto: " + SalarioBruto);
        System.out.println("Salario Liquido: " + SalarioLiquido);


    }
}