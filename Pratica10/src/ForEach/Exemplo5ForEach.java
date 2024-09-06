package ForEach;

import java.util.Arrays;
import java.util.List;

public class Exemplo5ForEach {
    public static void main(String[] args) {
        List<ProdutoFE> produtos = Arrays.asList(
                new ProdutoFE(1, "Teclado", 50.00),
                new ProdutoFE(2, "Mouse", 30.00),
                new ProdutoFE(3, "Monitor", 250.00),
                new ProdutoFE(4, "Notebook", 1200.00),
                new ProdutoFE(5, "Cadeira", 150.00)
        );
// Aplica um desconto de 10% em produtos caros e imprime os detalhes
        produtos.stream()
                .filter(p -> p.getPreco() > 200) // Filtra produtos caros
// Aplica um desconto de 10%
                .map(p -> new ProdutoFE(p.getCodigo(),
                        p.getNome(),
                        p.getPreco() * 0.9))
                .forEach(System.out::println); // Imprime os detalhes dos produtos
    }
}
