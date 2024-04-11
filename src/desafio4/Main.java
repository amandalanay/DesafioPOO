package desafio4;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ServicoConta contaServico = new ServicoConta();
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da conta"));
        conta.setNumeroConta(numeroConta);

        String nome = JOptionPane.showInputDialog("Insira o titular da conta");
        conta.setNomeTitular(nome);

        int depositoInicial = JOptionPane.showConfirmDialog(null, "Existe depósito inicial?");

        if (depositoInicial == JOptionPane.YES_OPTION) {
            double quantia;
            String quantiaDeposito = JOptionPane.showInputDialog(null, "Insira um valor inicial");
            quantia = Double.parseDouble(quantiaDeposito);
            conta.setSaldo(quantia);
        }

        JOptionPane.showMessageDialog(null, "Dados da " + conta);

        double depositoDois;
        String deposito = JOptionPane.showInputDialog(null, "Insira um valor de depósito");
        depositoDois = Double.parseDouble(deposito);
        contaServico.depositar(conta, depositoDois);

        JOptionPane.showMessageDialog(null, "Dados da " + conta);

        double saqueFinal;
        String saque = JOptionPane.showInputDialog("Insira um valor de saque");
        saqueFinal = Double.parseDouble(saque);
        contaServico.sacar(conta, saqueFinal);

        JOptionPane.showMessageDialog(null, "Dados da " + conta);
    }
}