package Lista1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int número;
        int soma = 0;

        for(int i = 1; i <= 10; i++){

            System.out.println("Digite um número: ");
            número = leitor.nextInt();
            if(número > 0){
                soma += número;
            }
            
            else{
                break;
            }
        }

        System.out.println("A soma dos números positivos é: " + soma);
        leitor.close();
        
    }
}
