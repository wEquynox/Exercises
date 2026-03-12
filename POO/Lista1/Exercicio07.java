package Lista1;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int número;

        for(int i = 1; i > 0; i++){
            System.out.println("Digite um número: ");
            número = leitor.nextInt();

            if(número == 0){
                System.out.println("Fim do código!");
                break;
            }
        }

        leitor.close();
    }
}
