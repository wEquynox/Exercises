package Aula7.colecoes_static;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private int totalContas;


    public Cliente(String n, String cpf) {
        this.nome = n;
        this.cpf = cpf;
        this.totalContas = 0;
    }
    }

    public int getTotalContas() {
        return totalContas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }
}
