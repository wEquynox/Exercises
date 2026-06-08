import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero da compra: ");
        int numero = sc.nextInt();

        System.out.print("Valor da compra: ");
        double valor = sc.nextDouble();

        sc.nextLine();

        System.out.print("Data da compra: ");
        String data = sc.nextLine();

        System.out.print("Numero de parcelas: ");
        int parcelas = sc.nextInt();

        System.out.println("Servico de pagamento:");
        System.out.println("1 - PicPay");
        System.out.println("2 - PagSeguro");

        int opcao = sc.nextInt();

        Compra compra = new Compra(numero, valor, data, parcelas);

        ServicoDePagamento servico;

        if (opcao == 1) {
            servico = new PicPayPayment();
        } else {
            servico = new PagSeguroPayment();
        }

        CalculaParcelas calculadora = new CalculaParcelas(servico);

        calculadora.processarCompra(compra, parcelas);

        System.out.println("\nParcelas:");

        for (Parcela p : compra.getParcelas()) {
            System.out.printf(
                    "Parcela %d: R$ %.2f%n",
                    p.getNumeroParcela(),
                    p.getValorParcela()
            );
        }

        sc.close();
    }
}