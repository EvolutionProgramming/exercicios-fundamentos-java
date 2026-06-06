package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class InverteVetores {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] vetor = new int[10];
            int cont;
            for (cont = 0; cont < 10; cont++) {
                System.out.println("Digite um valor inteiro: ");
                vetor[cont] = sc.nextInt();
            }
            for (cont = 0; cont < 5; cont++) {
                int fimVetor = 9 - cont;
                int auxilio;
                auxilio = vetor[cont];
                vetor[cont] = vetor[fimVetor];
                vetor[fimVetor] = auxilio;
            }

            System.out.println(Arrays.toString(vetor));

        }
    }
}
