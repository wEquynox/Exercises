                                                                                                        
package Aula3_Métodos; 
import javax.swing.JOptionPane;

public class TestaMétodos {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.saldo = 1500;
        Cliente cli1 = new Cliente();
        cli1.nome = "Gabriel";
        c1.titular = cli1;

        c1.titular.nome = JOptionPane.showInputDialog("Digite o nome do usuário: ");


        System.out.println("Você possui: " + c1.saldo);
        System.out.println(c1.titular.nome);
        
        c1.depositar(190);

        System.out.println("Você possui: " + c1.saldo);

        c1.sacar(2000);
        if(!c1.sacar(2000)){        /*if (c1.sacar(2000) == false) */
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Você possui: " + c1.verSaldo());

        c1.transfere(c2, 300);

        System.out.println(c2.saldo);
        System.out.println(c1.saldo);

        /*static boolean deposita(double valor, Conta c){
            if(valor > 0){
                c.saldo += valor;
                return true;
            }

            else{
                return false;
            }

            c.saldo += valor;
        }*/
    }
}

