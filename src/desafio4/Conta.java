
package desafio4;

public class Conta {
    private int numeroConta;
    public String nomeTitular;
    private double saldo;

    public Conta() {
    }
    public Conta(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "Número da conta: " + numeroConta +
                ", Nome do titular: " + nomeTitular + '\'' +
                ", Saldo: " + saldo +
                '}';
    }
}