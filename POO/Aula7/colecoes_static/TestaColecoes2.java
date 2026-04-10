package Aula7.colecoes_static;

import java.util.ArrayList;

public class TestaColecoes2 {
        public static void main(String[] args) {
    ArrayList<Conta> contas = new ArrayList<Conta>();


        Conta conta1 = new Conta(new Cliente("João", "123.456.789-00"));
        Conta conta2 = new Conta(new Cliente("Maria", "987.654.321-00"));
        
        System.out.println("O total de contas do cliente João é: " + conta1.getTitular().getTotalContas());


        contas.add(conta1);
        contas.add(conta2);

        for(Conta c: contas){
            System.out.println(c.getTitular().getNome());
        }


    }
}
