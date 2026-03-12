package Aula1;

public class TestaString {
    public static void main(String[] args) {
        char letra;
        letra = 'a';

        String nome = "Gabriel";

        System.out.println("letra = "+letra);

        System.out.println("palavra: "+nome);

        int idade = 15;
        boolean amigoDoDono = true;

        if(idade < 18 && amigoDoDono == false){
            System.out.println("Não pode entrar");
        }

        else{
            System.out.println("Pode entrar!");


        }
    }
}
