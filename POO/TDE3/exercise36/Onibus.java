package TDE3.exercise36;

public class Onibus extends Veiculo {
    
    public Onibus(String modelo, double valor) {
        super(modelo, valor);
        incrementarContador();
    }

    public double getImposto() {
        return super.getImposto() + 800;
    }
}   
