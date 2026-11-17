import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Temperatura;
        double Umidade;

        System.out.print("Temperatura em Celsius: ");
        Temperatura = sc.nextDouble();

        System.out.print("Umidade relativa do ar: ");
        Umidade = sc.nextDouble();

        if (Temperatura >= 38) {
            System.out.println("Alerta de calor extremo");
        }

        if (Umidade < 30) {
            System.out.println("Alerta de umidade baixa");
        }

        if (Temperatura >= 35 && Umidade < 20) {
            System.out.println("Alerta de risco de queimada");
        }

        sc.close();
    }
}