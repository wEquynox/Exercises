package interfaces.entidades;

import java.util.ArrayList;

public class Diretor extends Funcionario {
    private ArrayList<String> agencias = new ArrayList<String>();

    public Diretor(String nome, String cpf){
        super(nome, cpf);
    }

    public double getBonificacao(){
        return super.getSalario() *0.5;
    }
    public void addAgencia(String ag){
        this.agencias.add(ag);
    }

    public ArrayList<String> getAgencias(){
        return this.agencias;
    }



}
