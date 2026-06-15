package metodos;

import java.util.Scanner;

public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();

        while (!verificarFormato(cpf)) {
            System.out.println("Formato inválido, tente novamente!");
            cpf = sc.nextLine();
        }

        String cpfLimpo = cpf.replaceAll("\\D", "");

        int digito1Calculado = calcularDigito(cpfLimpo, 10);
        int digito2Calculado = calcularDigito(cpfLimpo, 11);

        int digito1Real = Character.getNumericValue(cpfLimpo.charAt(9));
        int digito2Real = Character.getNumericValue(cpfLimpo.charAt(10));

        if (digito1Calculado == digito1Real && digito2Calculado == digito2Real) {
            System.out.println("Parabéns! O CPF informado é VÁLIDO.");
        } else {
            System.out.println("Ops! Este CPF é INVÁLIDO (os dígitos verificadores não batem).");
        }

        sc.close();
    }

    public static boolean verificarFormato(String cpf) {
        if (cpf == null) return false;

        String apenasNumeros = cpf.replaceAll("\\D", "");
        return apenasNumeros.length() == 11;
    }

    public static int calcularDigito(String cpf, int pesoInicial) {
        int soma = 0;
        int peso = pesoInicial;
        int quantidadeDigitos = pesoInicial - 1;

        for (int i = 0; i < quantidadeDigitos; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * peso;
            peso--;
        }

        int resto = soma % 11;
        int resultado = 11 - resto;

        if (resultado > 9) {
            return 0;
        } else {
            return resultado;
        }
    }
}
