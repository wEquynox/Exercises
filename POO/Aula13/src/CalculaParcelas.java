public class CalculaParcelas {
    ServicoDePagamento servicoDePagamento;

    public CalculaParcelas(ServicoDePagamento servicoDePagamento) {
        this.servicoDePagamento = servicoDePagamento;
    }

    public void processarCompra(Compra compra, int numeroDeParcelas) {
        
        double parcelaBase = compra.getValor() / numeroDeParcelas;

        for (int i = 1; i <= numeroDeParcelas; i++) {

            double parcelaComTaxa = servicoDePagamento.taxaDePagamento(parcelaBase, i);

            double parcelaFinal = servicoDePagamento.jurosAoMes(parcelaComTaxa);

            Parcela parcela = new Parcela(i, parcelaFinal);

            compra.getParcelas().add(parcela);

        }
    }
}