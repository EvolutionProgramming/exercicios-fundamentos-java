package metodos;

import java.util.Scanner;

public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        // verifica se o formato é de 11 numeros se nao for entra no loop ate o formato ser de 11 números
        while (!verificarFormato(cpf)) {
            System.out.println("Formato inválido, tente novamente!");
            cpf = sc.nextLine();
        }
        // replaceAll com o regex //D para deixar apenas os números
        String cpfLimpo = cpf.replaceAll("\\D", "");
        // calcula buscando o digitoCalculado para comparação com o digitoReal
        int digito1Calculado = calcularDigito(cpfLimpo, 10);
        int digito2Calculado = calcularDigito(cpfLimpo, 11);
        // pega os respectivos numeros da nona e decima posição
        int digito1Real = Character.getNumericValue(cpfLimpo.charAt(9));
        int digito2Real = Character.getNumericValue(cpfLimpo.charAt(10));
        // verifica se o digitoCalculado é compatível com o digitoReal
        if (digito1Calculado == digito1Real && digito2Calculado == digito2Real) {
            System.out.println("Parabéns! O CPF informado é VÁLIDO.");
        } else {
            System.out.println("Ops! Este CPF é INVÁLIDO (os dígitos verificadores não batem).");
        }

        sc.close();
    }
    //aqui crio o metódo que vai verificar se o formato é compatível a de um CPF
    public static boolean verificarFormato(String cpf) {
        if (cpf == null) return false;
        //aqui usei o  replaceAll com o regex //D para deixar apenas os números.
        String apenasNumeros = cpf.replaceAll("\\D", "");
        return apenasNumeros.length() == 11;
    }
    // metodo que usa matemática com base no Módulo 11 para validar os dois ultimos digitos do CPF
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
