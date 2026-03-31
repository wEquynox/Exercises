package Aula5;

public class ContaBancaria {
    
    private int numeroConta;
    private double saldo;
    public String titular;

    //Métodos

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setNumeroConta(int n) {
        this.numeroConta = n;
    }

    public void setSaldo(double n) {
        this.saldo = n;
    }

    public void setTitular(String n) {
        this.titular = n;
    }
    
}
