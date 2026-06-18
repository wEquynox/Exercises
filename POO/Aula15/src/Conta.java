public class Conta {
    
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) throws ContaException {
        if (valor < 0) {
            throw new ContaException("Valor de depósito não pode ser negativo.");
        }
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
