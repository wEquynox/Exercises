public class PagSeguroPayment implements ServicoDePagamento {
            
    @Override
    public double taxaDePagamento(double valor, int mes) {
        return valor + valor * 0.02 * mes;
    }

    @Override
    public double jurosAoMes(double valor) {
        return valor + valor * 0.015;
    }
}
