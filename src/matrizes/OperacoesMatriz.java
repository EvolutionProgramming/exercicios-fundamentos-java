package matrizes;

import java.util.Scanner;

public class OperacoesMatriz {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] matriz = new int[4][4];
            boolean identidade = true;

            for (int linha = 0; linha < 4; linha++) {
                for (int coluna = 0; coluna < 4; coluna++) {
                    System.out.println("Você esta na posição [" + linha + "] [" + coluna + "]");
                    System.out.println("Digite o valor que você quer inserir: ");
                    matriz[linha][coluna] = sc.nextInt();

                    if(linha == coluna){
                        if (matriz[linha][coluna] != 1){
                            identidade = false;
                        }
                    } else if (matriz[linha][coluna] != 0){
                        identidade = false;
                    }
                }
            }

            if (identidade){
                System.out.println("Isso é uma Matriz Identidade");
            } else {
                System.out.println("Isso não é uma Matriz Identidade");
            }
            System.out.println("Matriz normal:");
            for (int[] linha : matriz){
                for(int coluna : linha){
                    System.out.print(coluna+"\t");

                }
                System.out.println();
            }
            System.out.println("Matriz transposta:");
            for (int linha = 0; linha < 4; linha++){
                for (int coluna = 0; coluna < 4; coluna++){
                    System.out.print(matriz[coluna][linha]+"\t");
                }
                System.out.println();
            }
        }
    }
}
