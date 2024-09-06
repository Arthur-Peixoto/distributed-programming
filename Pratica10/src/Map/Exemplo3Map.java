package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo3Map {
    public static void main(String[] args) {
// Lista de produtos
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet")
        );
// Transformações usando map: concatenação e conversão para maiúsculas
        List<String> resultados = produtos.stream()
// Concatena código e nome
                .map(p -> p.getCodigo() + " - " + p.getNome())
                .map(String::toUpperCase) // Converte para maiúsculas
                .collect(Collectors.toList()); // Coleta o resultado em uma lista
        System.out.println("Resultados: " + resultados);
    }
}