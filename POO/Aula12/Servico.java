package Aula12;

public class Servico implements Tributavel {

    private String descricao;
    private double valor;
    private double aliquotaISS;

    public Servico(String descricao, double valor, double aliquotaISS) {
        this.descricao = descricao;
        this.valor = valor;
        this.aliquotaISS = aliquotaISS;
    }

    public double getValorImposto() {
        return this.valor * aliquotaISS/100;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getAliquotaISS() {
        return aliquotaISS;
    }
}
