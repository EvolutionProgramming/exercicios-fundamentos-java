import java.util.Arrays;
import java.util.Scanner;

public class FrequenciaVetor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] numeros = new int[15];

            for (int cont = 0; cont < 15; cont++) {
                System.out.print("Digite o " + (cont + 1) + "º número: ");
                numeros[cont] = sc.nextInt();
            }

            Arrays.sort(numeros);

            System.out.println("Contagem: ");

            for (int i = 0; i < numeros.length; i++) {
                int contador = 1;

                while (i + 1 < numeros.length && numeros[i] == numeros[i + 1]) {
                    contador++;
                    i++;
                }

                System.out.println("O número " + numeros[i] + " se repete " + contador + " vez(es).");
            }
        }
    }
}