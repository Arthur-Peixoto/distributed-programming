@FunctionalInterface
public interface MinhaInterfaceFuncional {
    void print(String mensagem);
    //void agir();
    //void agir2(); 
    // Erro de compilação pois não pode ter mais de um método abstrato
    default void metodoDefault() {
        System.out.println("Método default");
    }
    static void metodoStatic() {
        System.out.println("Método static");
    }
}
