package Aula12;

public class CaulculadoraImposto {
    
    private double totalImposto;

    public double caucularImposto(Tributavel t) {
        double imposto = t.getValorImposto();
        this.totalImposto += imposto;
        return imposto;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
