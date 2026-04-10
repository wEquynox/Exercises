package Aula7.colecoes_static;
import java.util.ArrayList;

public class TestaColecoes {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<String>();

        palavras.add("Gabriel");
        palavras.add("Jabuti");
        palavras.add("feijao");
        palavras.add("farinha");

        System.out.println("O tamanho da lista eh: " + palavras.size());

        /*
        for(int i = 0; i < palavras.size(); i++){
            System.out.println(palavras.get(i));
        }
        */
        
        for(String s: palavras){
            System.out.println(s);
        }

        // Esse ultimo for funciona da seguinte forma, ele cria uma variável do tipo String chamada s, e para cada elemento da lista palavras, ele atribui o valor desse elemento para a variável s, e depois executa o bloco de código dentro do for, ou seja, ele imprime o valor de s, que é o valor do elemento da lista, ou seja, ele imprime cada elemento da lista palavras.


        palavras.remove("Gabriel");
        palavras.remove(2);


        for(String s: palavras){
            System.out.println(s);
        }

    }
}
