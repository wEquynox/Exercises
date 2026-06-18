public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando método main...");
        metodo1();
        System.out.println("Concluindo método main...");
    }

    public static void metodo1() {
        System.out.println("Iniciando método 1...");

        metodo2();

        System.out.println("Concluindo método 1...");
    }

    public static void metodo2() {
        System.out.println("Iniciando método 2...");

        throw new RuntimeException("Ocorreu um erro no método 2!");
        
    }
}