package desafio4;


import javax.swing.*;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        Conta conta;
        ContaServico contaServico = new ContaServico();
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao programa de Conta Bancária!");

        String inputNumero = JOptionPane.showInputDialog("Insira o número da conta");
        int numeroConta = Integer.parseInt(inputNumero);

        String titularConta = JOptionPane.showInputDialog( "Insira o titular da conta");

        String existeDeposito = JOptionPane.showInputDialog("Existe depósito inicial (s/n)");
        if (existeDeposito.equalsIgnoreCase("s")) {
            String inputQUantiaDeposito = JOptionPane.showInputDialog("Insira o valor inicial");
            double valorInicial = Double.parseDouble(inputQUantiaDeposito);
            conta = new Conta(numeroConta, titularConta, valorInicial);
        }else {
            conta = new Conta(numeroConta, titularConta);
        }

        JOptionPane.showMessageDialog(null, conta);

        String inputQuantia = JOptionPane.showInputDialog("Insira um valor de depósito");
        double quantia = Double.parseDouble(inputQuantia);

        contaServico.depositar(conta, quantia);

        JOptionPane.showMessageDialog(null, conta);

        inputQuantia = JOptionPane.showInputDialog("Insira um valor de saque");
        quantia = Double.parseDouble(inputQuantia);

        contaServico.sacar(conta, quantia);
        JOptionPane.showMessageDialog(null, conta);
    }
}