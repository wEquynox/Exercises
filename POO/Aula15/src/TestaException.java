public class TestaException {
    
    public static void main(String[] args) {
        Conta conta = new Conta(1000);

        try {
            conta.depositar(-500);
        } catch (ContaException e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
