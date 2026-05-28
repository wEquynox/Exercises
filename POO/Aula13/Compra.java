import java.util.ArrayList;

public class Compra {
    private int numero;
    private double valor;
    private String dataCompra;
    private int numeroParcelas;
    private ArrayList<Parcela> parcelas;

    public Compra(int numero, double valor, String dataCompra, int numeroParcelas) {
        this.numero = numero;
        this.valor = valor;
        this.dataCompra = dataCompra;
        this.numeroParcelas = numeroParcelas;
        this.parcelas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public ArrayList<Parcela> getParcelas() {
        return parcelas;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
}
