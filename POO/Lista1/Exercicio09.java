package Lista1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int idade;
        int soma = 0;

        for(int i = 0; i <= 4; i++){
            System.out.println("Digite a idade: ");
            idade = leitor.nextInt();
            soma += idade;
            
        }

        soma = soma / 5;

        System.out.println("A média das idades é: " + soma);
        leitor.close();
    }
}
