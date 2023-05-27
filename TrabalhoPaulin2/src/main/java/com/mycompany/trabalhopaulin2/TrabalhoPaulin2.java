package com.mycompany.trabalhopaulin2;

import javax.swing.JOptionPane;
import model.ContaBancaria;

public class TrabalhoPaulin2 {

    public static void main(String[] args) {

        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de contas que você deseja cadastrar:"));

        ContaBancaria[] contas = new ContaBancaria[tamanho];

        for (int i = 0; i < tamanho; i++) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
            String titular = JOptionPane.showInputDialog("Digite o nome do titular:");
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));

            contas[i] = new ContaBancaria(n, saldo, titular);
        }

        String resultado = "Contas cadastradas:\n";

        for (ContaBancaria conta : contas) {
            resultado += "Número: " + conta.getN();
            resultado += ", Titular: " + conta.getTitular();
            resultado += ", Saldo: " + conta.getSaldo();
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

        ordenarPorNumero(contas);
        exibirContasOrdenadas(contas);

        ordenarPorSaldo(contas);
        exibirContasOrdenadas(contas);
    }

    private static void ordenarPorNumero(ContaBancaria[] contas) {
        for (int i = 1; i < contas.length; i++) {
            ContaBancaria chave = contas[i];
            int j = i - 1;

            while (j >= 0 && contas[j].getN() > chave.getN()) {
                contas[j + 1] = contas[j];
                j--;
            }

            contas[j + 1] = chave;
        }
    }

    private static void ordenarPorSaldo(ContaBancaria[] contas) {
        for (int i = 1; i < contas.length; i++) {
            ContaBancaria chave = contas[i];
            int j = i - 1;

            while (j >= 0 && contas[j].getSaldo() > chave.getSaldo()) {
                contas[j + 1] = contas[j];
                j--;
            }

            contas[j + 1] = chave;
        }
    }

    private static void exibirContasOrdenadas(ContaBancaria[] contas) {
        String resultado = "Contas ordenadas:\n";

        for (ContaBancaria conta : contas) {
            resultado += "Número: " + conta.getN();
            resultado += ", Titular: " + conta.getTitular();
            resultado += ", Saldo: " + conta.getSaldo();
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}


