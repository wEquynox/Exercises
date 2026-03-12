package Lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int número;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        número = leitor.nextInt();
        int contador = 1;

        while(contador <= número){
            contador++;

            if(número == 1 || número == 2){
                System.out.println("O número digitado é primo!");
                break;
            }

            else if(número % contador == 0){
                System.out.println("O número digitado não é primo!");
                break;
            }

            else{
                System.out.println("O número digitado é primo!");
                break;
            }
  
        }

        leitor.close();
    }
}
