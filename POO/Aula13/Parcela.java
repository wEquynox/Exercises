public class Parcela {

    private int numeroParcela;
    private double valorParcela;

    public Parcela(int numeroParcela, double valorParcela) {
        this.numeroParcela = numeroParcela;
        this.valorParcela = valorParcela;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public double getValorParcela() {
        return valorParcela;
    }
}