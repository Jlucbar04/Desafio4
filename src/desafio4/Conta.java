package desafio4;

public class Conta {

    private int numero;
    private String nomeTitular;
    private double saldo;

    public Conta() {}
    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }
    public Conta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double quantia){
        this.saldo += quantia;
    }
    public void saque(double quantia){
        this.saldo -= quantia + 5;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero= " + numero +
                ", nomeTitular= " + nomeTitular +
                ", saldo= " + saldo +
                '}';
    }
}
