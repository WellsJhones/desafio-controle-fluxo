package edu.wells.modules;

import java.util.Scanner;

import edu.wells.exceptions.ParametrosInvalidosException;

public class Contador {
    static public void contador() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int firstNum = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int secondNum = scanner.nextInt();
        scanner.close();

        try {
            // chamando o método contendo a lógica de contagem
            contar(firstNum, secondNum);

        } catch (ParametrosInvalidosException e) {
            // imprimir a mensagem de erro
            System.out.println(e.getMessage());
            // imprimir a mensagem:
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        } else {
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o Nº " + (i + 1));
            }
        }

    }
}
