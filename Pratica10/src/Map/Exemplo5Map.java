package Map;

import java.util.Arrays;
import java.util.List;

public class Exemplo5Map {
    public static void main(String[] args) {
        List<String> marcas = Arrays.asList("Honda", "Toyota", "VW", "Chevrolet");
        marcas.stream()
                .map(Util.maiuscula)
                .forEach(Util.print);
        marcas.stream()
                .map(Util.maiuscula)
                .map(Util.primeiraLetra)
                .forEach(Util.print);
        marcas.stream()
                .map(Util.maiuscula)
                .map(Util.primeiraLetra)
                .map(Util::exclamacao)
                .forEach(Util.print);
    }
}