//2. Criar com new um array de 3 preços. Atribuir por índice os
//valores 12.90, 5.50 e 30.00 e imprimir cada um com um for
//no formato Produto 1: R$ 12,90.

public class Ex38 {
    public static void main(String[] args) {
        double[] precos = {12.90, 5.50, 30.00};

        for (int i = 0; i < precos.length; i++) {
            System.out.println("Produto"+(i + 1)+": "+precos[i]);
        }
    }
}