package Sorted;

class Produto {
    private int codigo;
    private String nome;
    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Filter.Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}