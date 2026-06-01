package sequencialcondicional;

import java.util.Scanner;

public class ValidadorTriangulo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a, b, c;
            System.out.println("Digite o tamanho do lado A:");
            a = sc.nextDouble();
            System.out.println("Digite o tamanho do lado B:");
            b = sc.nextDouble();
            System.out.println("Digite o tamanho do lado C:");
            c = sc.nextDouble();

            // verificando validade do triangulo com if/else
            if ((a <= 0) || (b <= 0) || (c <= 0)) {
                System.out.println("Não existe triângulo com valor 0 ou negativo!");
            } else if ((a + b > c) && (a + c > b) && (c + b > a)) {
                if ((a == b) && (b == c)) {
                    System.out.println("Este triângulo é equilátero!");
                } else if ((a == b) || (a == c) || (b == c)) {
                    System.out.println("Este triângulo é isósceles!");
                } else {
                    System.out.println("Este triângulo é escaleno!");
                }
            } else {
                System.out.println("Isto não é um triângulo!");
            }
        }
    }
}
