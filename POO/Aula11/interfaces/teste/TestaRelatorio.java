package interfaces.teste;

import interfaces.entidades.Funcionario;

import java.util.ArrayList;

import Interfaces.entidades.Diretor;
import Interfaces.entidades.Gerente;
import Interfaces.entidades.Relatorio;

public class TestaRelatorio {
    public static void main(String[] args) {
//        Funcionario f1 = new Funcionario("Beeberblox", "312.312.543-23");
        Gerente g1 = new Gerente("Zenom", "312.312.543-23");
        Diretor d1 = new Diretor("Hector", "312.312.543-23");

//        f1.setSalario(10000);
        g1.setSalario(10000);
        d1.setSalario(10000);

        Relatorio relatorio = new Relatorio();

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Gerente gerente = new Gerente("Zenom", "312.312.543-23");

        funcionarios.add(gerente);


//        funcionarios.add(f1);
        funcionarios.add(g1);
        funcionarios.add(d1);

        System.out.println("Relatorio de bonificações: ");
        System.out.println(relatorio.relatorioCompleto(funcionarios));


    }
}
