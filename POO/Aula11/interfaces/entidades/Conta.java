package interfaces.entidades;

public abstract class Conta {
    private int numero;
    private double saldo;
    private String agencia;
    private Cliente titular;
    private static int totalContas;

    public Conta(String agencia, int numero, Cliente titular){
        //System.out.println("Construindo uma conta...");
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        totalContas++;
    }

    public Conta(String agencia, int numero){
        //System.out.println("Construindo uma conta...");
        this.agencia = agencia;
        this.numero = numero;
        totalContas++;
    }


    // ISSO FEITO ACIMA CHAMA-SE SOBRECARGA (de construtor)


    public boolean depositar(double valor){
        if(valor<0)
            return false;

        this.saldo += valor;
        return true;
    }
    public static int getTotalContas(){
        return totalContas;
    }

    public boolean sacar(double v){
        if(v>saldo) {
            //System.out.println("saldo insuficiente");
            //nao faz sentido esse print aqui
            return false;
        }
        this.saldo -= v;
        return true;
    }

    void transferir(double valor, Conta destino){
        this.saldo -= valor;
        destino.saldo += valor;
    }

    public double calculaRendimento(){
        return this.saldo * 2/100;
    }




    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }



    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo(){
        return this.saldo;
    }


}


