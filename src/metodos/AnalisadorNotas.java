package metodos;

import java.util.Scanner;

public class AnalisadorNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double soma = 0.0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + "° nota:");
            soma += leitor.nextDouble();
        }

        double media = soma / 4;

        if (!verificarNota(media)) {
            System.out.println("Com base nas 4 notas você foi REPROVADO!❌");
            System.out.println("A sua média foi de: " + media);
        } else {
            System.out.println("Com base nas 4 notas você foi APROVADO!✅");
            System.out.println("A sua média foi de: " + media);
        }

        leitor.close();
    }

    public static boolean verificarNota(double media) {
        return media >= 7;
    }
}


