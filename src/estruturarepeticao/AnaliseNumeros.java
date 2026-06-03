package estruturarepeticao;

import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int entrada;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int somaPares = 0;
            int qtdImpares = 0, qtdPares = 0;
            int qtdEntrada = 0;
            double mediaPares = 0;
            double percentImpar = 0;

            do {
                System.out.println("Digite um numero inteiro positivo: (Entre 0 para sair)");
                entrada = sc.nextInt();

                if (entrada <= 0) {
                    if (qtdEntrada == 0){
                        maior = 0;
                        menor = 0;
                    }
                    break;
                }
                //incrementa pra validar que houve uma entrada valida
                qtdEntrada++;

                if (entrada > maior) {
                    maior = entrada;
                }
                if (entrada < menor) {
                    menor = entrada;
                }

                if (entrada % 2 == 0) {
                    somaPares += entrada;
                    qtdPares++;
                } else {
                    qtdImpares++;
                }

            } while (true);

            if (qtdPares != 0) {
                mediaPares = somaPares / (double) qtdPares;
            }
            if (qtdEntrada != 0) {
                percentImpar = (qtdImpares / (double) qtdEntrada) * 100;
            }
            System.out.println("O menor número digitado foi: " + menor);
            System.out.println("O maior número digitado foi: " + maior);
            System.out.printf("A média dos números pares foi: %.2f%n",mediaPares);
            System.out.printf("O percentual de numero ímpares foi: %.2f%%%n",percentImpar);

        }

    }
}
