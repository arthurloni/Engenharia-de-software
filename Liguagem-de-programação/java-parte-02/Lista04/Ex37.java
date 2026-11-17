//1. As notas de um aluno são {7.5, 6.0, 8.0, 5.5}. Criar o
//array com lista entre chaves e imprimir a quantidade de
//notas, a primeira nota e a última nota, obtendo o último
//índice por meio de length.

public class Ex37 {
    public static void main(String[] args) {
        double[] notas = {7.5, 6.0, 8.0, 5.5};

        int qtd = notas.length;
        System.out.println("Quantidade de notas: " + qtd);
        System.out.println("Primeira notas: " + notas[0]);
        System.out.println("Ultima notas: " + notas[notas.length - 1]);
    }
}
