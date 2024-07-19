import java.util.Arrays;
import java.util.List;

public class ForeachFuncionalEx3 {
    public static void main(String[] args) {
        List<String> paises = Arrays.asList("Brasil", "Alemanha", "Espanha", "Italia", "Colombia");

        paises.forEach(p -> imprimir(p));
        System.out.println("Usando ForEach Funcional");
        paises.forEach(ForeachFuncionalEx3::imprimir);
    }

    static void imprimir(String mensagem){
        System.out.println("O texto passado é: " + mensagem);
    }

}

