package sequencialcondicional;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int valorSaque;
            int cem, cinquenta, vinte, dez, cinco, um, resto;
            System.out.println("Digite o valor que você quer sacar: ");
            valorSaque = sc.nextInt();

            resto = valorSaque;
            if (valorSaque > 0) {
                // implemento aqui o que é chamado de Algoritmo Guloso ou em inglês Greedy Algorithm
                cem = resto / 100;
                resto = resto % 100;

                cinquenta = resto / 50;
                resto = resto % 50;

                vinte = resto / 20;
                resto = resto % 20;

                dez = resto / 10;
                resto = resto % 10;

                cinco = resto / 5;
                resto = resto % 5;

                um = resto / 1;
                resto = resto % 1;

                // concatenação e caractere de escape \n para formatar a saída da quantidade de notas e valores
                System.out.println("Seu saque foi de:\n " + cem + " notas de 100R$\n " + cinquenta + " notas de 50R$\n " + vinte + " notas de 20R$\n " + dez + " notas de 10R$\n " + cinco + " notas de 5R$\n " + um + " notas de 1R$\n");

            }else {
                System.out.println("Valor inválido, encerrando processo!");
            }

        }

    }
}
