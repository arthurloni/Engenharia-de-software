// Primeiro exercicio =  Leitura de dados (nome,idade,altura)
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Name;
        int Idade;
        double Altura;

        System.out.println("Digite seu Nome: ");
        Name = sc.next();
        System.out.println("Digite sua Idade: ");
        Idade = sc.nextInt();
        System.out.println("Digite seu Altura: ");
        Altura = sc.nextDouble();

        System.out.println("Suas Informação, Nome: " + Name + " | Idade: " + Idade + " | Altura: " + Altura);

    }
}