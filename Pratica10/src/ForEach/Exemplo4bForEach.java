package ForEach;

import java.util.HashMap;
import java.util.Map;

public class Exemplo4bForEach {
    public static void main(String[] args) {
// versão com HashMap
        Map<Integer, ProdutoFE> produtos = new HashMap<>();
        produtos.put(1, new ProdutoFE(1, "Teclado", 50.00));
        produtos.put(2, new ProdutoFE(2, "Mouse", 30.00));
        produtos.put(3, new ProdutoFE(3, "Monitor", 250.00));
        produtos.put(4, new ProdutoFE(4, "Notebook", 1200.00));
        produtos.put(5, new ProdutoFE(5, "Cadeira", 150.00));
// Filtra produtos com preço maior que 100 e imprime seus nomes
        produtos.values().stream()
.filter(p -> p.getPreco() > 100) // Filtra produtos caros
                .map(ProdutoFE::getNome) // Mapeia para os nomes dos produtos
                .forEach(System.out::println); // Imprime os nomes
    }
}
