package Aula7.colecoes_static;

public class Conta {
    private int numero;
    private double saldo;
    private String agencia;
    private Cliente titular;
    public static int totalContas;

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

    public Conta(Cliente C){
        this.titular = C;
        totalContas++;
    }

    //Isso se chama sobrecarga de métodos, ou seja, ter mais de um método com o mesmo nome, mas com parâmetros diferentes, serve para facilitar a vida do programador, para que ele possa criar uma conta de várias formas diferentes, sem precisar criar vários métodos com nomes diferentes, e também para que ele possa criar uma conta de forma mais rápida, sem precisar passar todos os parâmetros, por exemplo, se ele quiser criar uma conta apenas com o titular, ele pode usar o construtor Conta(Cliente C), sem precisar passar o número e a agência, e depois setar esses valores depois, usando os setters.

    boolean depositar(double valor){
        if(valor<0)
            return false;

        this.saldo += valor;
        return true;
    }

    boolean sacar(double v){
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
        return this.saldo + 200;
    }


}


