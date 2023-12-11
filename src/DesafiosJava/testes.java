package DesafiosJava;

import java.util.Scanner;

public class testes {

	public static void main(String[] args) {
		
        // Criando um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário para inserir um número inteiro positivo
        System.out.print("Insira um número inteiro positivo maior que 0: ");

        // Lendo o número fornecido pelo usuário
        int numero = scanner.nextInt();

        // Fechando o Scanner após a leitura
        scanner.close();

        // Verificando se o número inserido é válido
        if (numero <= 0) {
            System.out.println("Por favor, insira um número inteiro positivo maior que 0.");
        } else {
            // Calculando a soma de todos os números de 1 até o número inserido
            int soma = 0;
            for (int i = 1; i <= numero; i++) {
                soma += i;
            }

            // Exibindo o resultado
            System.out.println("A soma de todos os números de 1 até " + numero + " é: " + soma);
        }
    }
}

