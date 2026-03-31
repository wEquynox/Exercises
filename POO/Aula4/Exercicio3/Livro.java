package Aula4.Exercicio3;

public class Livro {
    
    //Atributos
    String titulo;
    String autor;
    int quantidadePaginas;
    boolean disponivel;

    //Métodos
    boolean verificarDisponibilidade(){
        return disponivel;
    }

    boolean emprestar(String nomePessoa){
        if(disponivel) {
            disponivel = false;
            return true;
        } 
        
        else{
            return false;
        }
    }

    boolean devolver(String nomePessoa){
        if(disponivel == false){
            disponivel = true;
            return true;
        }

        else{
            return false;
        }
    }
}
