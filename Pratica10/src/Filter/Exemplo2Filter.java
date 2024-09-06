package Filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo2Filter {
    public static void main(String[] args) {
// Lista de produtos
        List<Produto> produtos = Arrays.asList(
                new Produto(101, "Notebook"),
                new Produto(202, "Smartphone"),
                new Produto(303, "Tablet"),
                new Produto(404, "Smartwatch")
        );
// Filtra produtos cujo nome começa com "S"
        List<Produto> produtosComS = produtos.stream()
// Mantém apenas produtos cujo nome começa com "S"
                .filter(p -> p.getNome().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("Produtos com 'S': " + produtosComS);
    }
}
