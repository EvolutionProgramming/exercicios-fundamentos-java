package estruturarepeticao;

import java.util.Scanner;

public class AdvinhadorNumeros {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numeroSecreto, entrada, tentativas = 0;
            numeroSecreto = (int) (Math.random() * 100) + 1;

            do {
                System.out.println("Aposte um valor de 1 a 100 (Digite 0 caso queira sair): ");
                entrada = sc.nextInt();
                if (entrada == 0) {
                    System.out.println("Programa finalizando...");
                    System.exit(0);
                }
                while (entrada < 1 || entrada > 100) {
                    System.out.println("NUMERO INVALIDO! Digite um valor de 1 a 100 (Digite 0 caso queira sair): ");
                    entrada = sc.nextInt();
                    if (entrada == 0){
                        System.out.println("Programa finalizando...");
                        System.exit(0);
                    }
                }
                tentativas++;

                if (entrada < numeroSecreto) {
                    System.out.println("Dica: Suba a aposta");
                } else if (entrada > numeroSecreto) {
                    System.out.println("Dica: Desça a aposta");
                }
            }
            while (entrada != numeroSecreto);

            System.out.println("PARABÉNS! VOCE ACERTOU O NUMERO SECRETO!");
            System.out.println("Tentativas: " + tentativas);

        }
    }
}

