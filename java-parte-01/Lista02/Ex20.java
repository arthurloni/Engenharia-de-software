import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double VelocidadeMaxima;
        double Velocidade;
        double Percentual;

        System.out.print("Velocidade máxima da via: ");
        VelocidadeMaxima = sc.nextDouble();

        System.out.print("Velocidade do veículo: ");
        Velocidade = sc.nextDouble();

        Percentual = ((Velocidade - VelocidadeMaxima) / VelocidadeMaxima) * 100;

        if (Velocidade <= VelocidadeMaxima) {
            System.out.println("Não há multa");
        } else if (Percentual <= 20) {
            System.out.println("Infração média");
        } else if (Percentual <= 50) {
            System.out.println("Infração grave");
        } else {
            System.out.println("Infração gravíssima");
        }

        sc.close();
    }
}