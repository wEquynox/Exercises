package interfaces.teste;

import Interfaces.entidades.ContaFisica;
import Interfaces.entidades.ContaSalario;

public class TestaHeranca {
    public static void main(String[] args) {
        ContaFisica cf1 = new ContaFisica("0144-9", 321);
        ContaSalario cs1 = new ContaSalario("321-3", 432);

        cs1.depositar(1200);
        cs1.sacar(200);

        cf1.depositar(1200);
        cf1.sacar(200);

        System.out.println(cs1.getSaldo());

        System.out.println(cf1.getSaldo());


    }
}
