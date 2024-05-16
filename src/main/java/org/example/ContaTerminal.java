package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.exit;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0, selecao = 0 ;
        String opcoes, Agencia, nomeCliente;
        Float saldo = 0.0F;

        opcoes = "Selecione a opção que deseja \n" +
                "1| Criar conta Nova \n" +
                "2| Depositar um valor de Saldo \n" +
                "3| Retirar um valor depositado \n" +
                "Selecione qualquer outr opção para encerrar";
        System.out.println(opcoes);
        selecao = scanner.nextInt();

        while (selecao < 3) {
            if (selecao == 1) {
                criarConta();
            } else if (selecao == 2) {

            } else {

            }

            System.out.println(opcoes);
            selecao = scanner.nextInt();
        }
        if (saldo <= 0) {
            System.out.println("Não é possível ter saldo negativo");
            exit(0);
        }

    }

    private static void criarConta(){
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