package Aula12;

public class Main {
    
    public static void main(String[] args) {
        Produto p = new Produto("Cimento", 456.99);
        Servico s= new Servico("Reboco", 800.00, 20);

        CaulculadoraImposto calc = new CaulculadoraImposto();

        System.out.println("Imposto de " + p.getNome() + " = " + calc.caucularImposto(p));
        System.out.println("Imposto de " + s.getDescricao() + " = " + calc.caucularImposto(s));
    
        System.out.println("Total de Impostos = " + calc.getTotalImposto());
        System.out.println(calc.getTotalImposto());
    }
}
