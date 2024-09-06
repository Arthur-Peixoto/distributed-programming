package ForEach;

import java.util.Arrays;
import java.util.List;
public class Exemplo4ForEach {
    public static void main(String[] args) {
        List<ProdutoFE> produtos = Arrays.asList(
                new ProdutoFE(1, "Teclado", 50.00),
                new ProdutoFE(2, "Mouse", 30.00),
                new ProdutoFE(3, "Monitor", 250.00),
                new ProdutoFE(4, "Notebook", 1200.00),
                new ProdutoFE(5, "Cadeira", 150.00)
        );
// Filtra produtos com preço maior que 100 e imprime seus nomes
        produtos.stream()
                .filter(p -> p.getPreco() > 100) // Filtra produtos caros
                .map(ProdutoFE::getNome) // Mapeia para os nomes dos produtos
                .forEach(System.out::println); // Imprime os nomes
    }
}