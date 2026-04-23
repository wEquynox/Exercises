package TDE3.exercise36;

public class Veiculo {
    private String modelo;
    private double valor;
    static int contadorVeiculos = 0;

    public Veiculo(String modelo, double valor) {
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void incrementarContador() {
        contadorVeiculos++;
    }

    public double getImposto() {
        return this.valor * 0.06;
    }

}
