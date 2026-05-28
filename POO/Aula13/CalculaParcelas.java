public class CalculaParcelas {
    ServicoDePagamento servicoDePagamento;

    public CalculaParcelas(ServicoDePagamento servicoDePagamento) {
        this.servicoDePagamento = servicoDePagamento;
    }

    public void processarCompra(Compra compra, int numeroDeParcelas) {
        
        double parcelaBase = compra.getValor() / numeroParcelas;

        for (int i = 1; i <= numeroParcelas; i++) {

            double parcelaComTaxa = servico.taxaDePagamento(parcelaBase, i);

            double parcelaFinal = servico.jurosAoMes(parcelaComTaxa);

            Parcela parcela = new Parcela(i, parcelaFinal);

            compra.getParcelas().add(parcela);

        }
    }
}