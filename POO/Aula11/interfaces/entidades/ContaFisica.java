package interfaces.entidades;

import interfaces.Interfaces.Tributavel;

public class ContaFisica extends Conta implements Tributavel {
    public ContaFisica(String ag, int num){
        super(ag, num);
    }

    @Override
    public boolean sacar(double v){
        return super.sacar(v+0.50);
    }

    @Override
    public double cobraImposto() {
        double imposto = super.getSaldo() * 0.02;
        super.setSaldo(super.getSaldo() - imposto);
        return imposto;
    }
}
