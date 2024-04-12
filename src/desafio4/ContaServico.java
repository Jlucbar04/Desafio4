package desafio4;

public class ContaServico {

    public void depositar(Conta conta, double quantia){
        double saldoAtual = conta.getSaldo();
        double quantiaAtualizada = saldoAtual += quantia;
        conta.setSaldo(quantiaAtualizada);
    }

    public void sacar(Conta conta, double quantia) {
        double saldoAtual = conta.getSaldo();
        double quantiaAtualizada = saldoAtual -+ quantia + 5;
        conta.setSaldo(quantiaAtualizada);
    }
}
