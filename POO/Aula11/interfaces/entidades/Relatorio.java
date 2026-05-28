package interfaces.entidades;

import java.util.ArrayList;

import interfaces.Interfaces.Tributavel;

public class Relatorio {

    public double calculaImposto(Funcionario f){
        double imposto = (f.getSalario() * 30/100) + (f.getBonificacao() * 5/100);
        return imposto;
    }

    public String relatorioCompleto(ArrayList<Funcionario> funcionarios){
        String rel = "";

        for(Funcionario f: funcionarios){
            rel += f.getNome()+" tem bonificação de  "+ f.getBonificacao()+"\n";
        }
        return rel;
    }

    public double totalRendimentos(ArrayList<Conta> contas){
        double soma = 0;
        for(Conta c: contas){
            soma += c.calculaRendimento();
        }

        return soma;
    }

    public void calculaImposto(Tributavel a) {
        System.out.println("Foi cobrado: " + a.cobraImposto());
    }

}
