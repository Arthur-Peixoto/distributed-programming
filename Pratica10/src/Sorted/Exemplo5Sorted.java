package Sorted;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

    public class Exemplo5Sorted {
        public static void main(String[] args) {
/*
Conjunto (Set) de produtos.
HashSet para armazenar os produtos,
o que garante que os produtos sejam únicos,
mas não garante nenhuma ordem específica.
*/
            Set<Produto> produtos = new HashSet<>();
            produtos.add(new Produto(101, "Notebook"));
            produtos.add(new Produto(202, "Smartphone"));
            produtos.add(new Produto(303, "Tablet"));
            produtos.add(new Produto(404, "Smartwatch"));
            produtos.add(new Produto(505, "PC"));
// Filtra produtos com nomes curtos (<= 7 caracteres),
// mapeia para "código - nome", e ordena por código
            Set<String> resultado = produtos.stream()
// Filtra produtos com nomes curtos
                    .filter(p -> p.getNome().length() <= 7)
// Mapeia para "código - nome"
                    .map(p -> p.getCodigo() + " - " + p.getNome())
                    .sorted() // Ordena em ordem crescente (natural para strings)
                    .collect(Collectors.toSet()); // Coleta o resultado em um Set
            System.out.println("Resultado: " + resultado);
        }
    }

