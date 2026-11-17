// 7. Lista de chamada. Ler o nome completo de 4 alunos em um array. Criar a funcao
// String gerarIniciais(String nomeCompleto), que devolve as iniciais em
// maiuscula separadas por ponto, e o procedimento exibirChamada(String[]
// nomes), que imprime no formato 1. maria da silva (M.D.S.).

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome completo do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);

        sc.close();
    }

        public static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().toUpperCase().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                iniciais = iniciais + partes[i].charAt(0) + ".";
            }
        }
        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i].trim() + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }
}
