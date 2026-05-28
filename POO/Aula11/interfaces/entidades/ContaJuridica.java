package interfaces.entidades;

import interfaces.Interfaces.Tributavel;

public class ContaJuridica extends Conta implements Tributavel {
    private String cnpj;

    public ContaJuridica(String agencia, int numero, String cnpj) {
        super(agencia, numero);
        this.cnpj = cnpj;
    }
    public boolean sacar (double v){
        return super.sacar(v+0.5);
    }
    public String getCnpj(){
        return this.cnpj;
    }

    @Override
    public double cobraImposto() {
        double imposto = super.getSaldo() * 0.02;
        super.setSaldo(super.getSaldo() - imposto);
        return imposto;
    }
}
