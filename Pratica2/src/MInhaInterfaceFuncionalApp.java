public class MInhaInterfaceFuncionalApp {
    public static void main(String[] args) {
        MinhaInterfaceFuncional func = System.out::println;
        func.print("Olá mundo");
        func.metodoDefault();
        MinhaInterfaceFuncional.metodoStatic();
    }
}
