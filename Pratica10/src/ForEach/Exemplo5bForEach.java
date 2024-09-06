package ForEach;

import java.util.HashMap;
import java.util.Map;

public class Exemplo5bForEach {


        public static void main(String[] args) {
            Map<Integer, ProdutoFE> produtos = new HashMap<>();
            produtos.put(1, new ProdutoFE(1, "Teclado", 50.00));
            produtos.put(2, new ProdutoFE(2, "Mouse", 30.00));
            produtos.put(3, new ProdutoFE(3, "Monitor", 250.00));
            produtos.put(4, new ProdutoFE(4, "Notebook", 1200.00));
            produtos.put(5, new ProdutoFE(5, "Cadeira", 150.00));
// Aplica um desconto de 10% em produtos caros e imprime os detalhes
            produtos.values().stream()
                    .filter(p -> p.getPreco() > 200) // Filtra produtos caros
// Aplica um desconto de 10%
                    .map(p -> new ProdutoFE(p.getCodigo(),
                            p.getNome(),
                            p.getPreco() * 0.9))
                    .forEach(System.out::println); // Imprime os detalhes dos produtos
        }

}
