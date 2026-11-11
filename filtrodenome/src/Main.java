import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Alberto");
        nomes.add("Julina");
        nomes.add("Ana Clara");
        nomes.add("Amanda");
        nomes.add("Marina");



        FiltroNome filtroNome = nome1 -> nome1.startsWith("M");

        nomes.stream().filter(nome1 -> filtroNome.testar(nome1)).forEach(nome -> System.out.println(nome));

    }
}

