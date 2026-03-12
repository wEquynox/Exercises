package Lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome;

        while(true){
            System.out.println("Digite o nome de um produto: ");
            nome = leitor.nextLine();

            if(nome.equalsIgnoreCase("sair")){
                System.out.println("Fim do código!");
                break;
            }
        }

        leitor.close();
    }
}
