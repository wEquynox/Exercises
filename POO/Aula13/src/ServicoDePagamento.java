public interface ServicoDePagamento {
    
    public double taxaDePagamento(double valor, int mes);

    public double jurosAoMes(double valor);

    
}
