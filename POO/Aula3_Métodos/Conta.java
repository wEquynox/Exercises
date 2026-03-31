                                                                                                        
package Aula3_Métodos;

public class Conta {

    // Atributos

    int numero;
    double saldo;
    String agencia;
    Cliente titular;





    // Métodos

    boolean depositar(double valor){
        if(valor < 0){
            return false;
        }

        else{
            saldo += valor;
            return true;
        }

    }

    boolean sacar(double v){
        if(v > saldo){/*
            System.out.println("Saldo insuficiente!");
            Não faz sentido pois não é uma calsse de print!!!*/
            return false;
        }

        this.saldo -= v;;
        return true;
    }

    double verSaldo(){
        return this.saldo;
    }

    void transfere(Conta destino, double valor){

        this.sacar(valor);

        destino.depositar(valor);
        
    }

}
