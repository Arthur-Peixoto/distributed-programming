public class FalarApp {
    public static void main(String[] args) {
        Falar brasileiro = () -> {
            return "Oi, tudo bem?";
        };
        Falar ingles = () -> {
            return "is in";
        };
        Falar japao = () -> {
            return "こんにちは、元気ですか？";
        };
        System.out.println(brasileiro.falar());
        System.out.println(ingles.falar());
        System.out.println(japao.falar());
    }
}
