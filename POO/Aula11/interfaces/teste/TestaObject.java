package interfaces.teste;

import Interfaces.entidades.Diretor;

public class TestaObject {
    public static void main(String[] args) {
        Diretor d1 = new Diretor("Hector", "123.312.423-43");
        Diretor d2 = new Diretor("Anderson", "123.312.423-43");


        System.out.println(d1.toString());
        System.out.println(d2);
//        System.out.println(d1.equals(null));



    }
}
