package interfaces.teste;

import interfaces.entidades.*;

import java.util.ArrayList;

public class TestaRelatorio2 {
    public static void main(String[] args) {

        ContaFisica cf1 = new ContaFisica("0133-9", 123);
        ContaJuridica cj1 = new ContaJuridica("0133-9", 312, "312.324.13/0001");
        ContaSalario cs1 = new ContaSalario("0133-9", 645);

        //Conta conta1 = new Conta("321-", 42342);


        cf1.depositar(1000);
        cs1.depositar(1000);
        cj1.depositar(1000);
        ArrayList<Conta> contas = new ArrayList<Conta>();

        contas.add(cj1);
        contas.add(cf1);
        contas.add(cs1);

        Relatorio rel = new Relatorio();
        System.out.println("O total de rendimentos somados é: ");
        System.out.println(rel.totalRendimentos(contas));

        rel.calculaImposto(cj1);

    }
}
