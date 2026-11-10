//Ler o consumo mensal de energia em kWh e calcular o valor da conta. Até 100
//kWh o preço é 0,50 por kWh. De 101 a 300 kWh o preço é 0,75 por kWh. Acima de 300
//kWh o preço é 1,10 por kWh. A faixa escolhida é aplicada sobre o consumo total.
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ConsumoMensal;
        double Calculo;

        System.out.print("Consumo mensal de energia em kWh: ");
        ConsumoMensal = sc.nextDouble();

        if (ConsumoMensal <= 100) {
            Calculo = ConsumoMensal * 0.50;
        } else if (ConsumoMensal <= 300) {
            Calculo = ConsumoMensal * 0.75;
        } else {
            Calculo = ConsumoMensal * 1.10;
        }

        System.out.printf("Valor da conta: R$ %.2f%n", Calculo);

        sc.close();
    }
}