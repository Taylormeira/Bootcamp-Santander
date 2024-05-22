package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0, selecao = 0;
        String opcoes, agencia, nomeCliente;
        Float saldo = 0.0F, deposito = 0.0F, saque = 0.0F;

        opcoes = "Selecione a opção que deseja \n" +
                "1| Criar conta Nova \n" +
                "2| Depositar um valor de Saldo \n" +
                "3| Retirar um valor depositado \n" +
                "Selecione qualquer outr opção para encerrar";
        System.out.println(opcoes);
        selecao = scanner.nextInt();

        while (selecao <= 3) {
            if (selecao == 1) {
                criarConta();
            } else if (selecao == 2) {
                System.out.println("informe o numero da agenda e da conta");
                agencia = scanner.next();
                numero = scanner.nextInt();
                System.out.println("Informe o valor que deseja depositar");
                deposito = scanner.nextFloat();
                if (deposito <= 0) {
                    System.out.println("Não é possível ter saldo negativo");

                } else {
                    saldo = saldo + deposito;
                }

            } else if (selecao == 3) {
                System.out.println("Infome o valor que deseja retirar: ");
                saque = scanner.nextFloat();
                if (saque <= 0) {
                    System.out.println("Não se pode sacar um valor negativo ou zero");
                } else if (saque > saldo) {
                    System.out.println("O valor solicitado é maior que o valor que tem de saldo");
                } else {
                    saldo = saldo - saque;
                    System.out.println("Retirado o valor de " + saque + " de sua conta restou o saldo de " + saldo );
                }
            }
            System.out.println(opcoes);
            selecao = scanner.nextInt();
        }
    }

    private static void criarConta() {
        int numero;
        String agencia, nomeCliente;
        Float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Copnta !");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do titular!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o Valor de Saldo!");
        saldo = scanner.nextFloat();
    }
}