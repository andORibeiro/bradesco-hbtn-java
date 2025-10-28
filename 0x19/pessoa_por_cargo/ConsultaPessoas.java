import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas){
        List <String> ordem = List.of("Product Owner", "Analista QA", "Desenvolvedor");
        Comparator<String> cmp = Comparator.comparingInt(ordem::indexOf);
        Map<String,List<Pessoa>> agrupado = pessoas.stream()
            .collect(Collectors.groupingBy(
                Pessoa::getCargo,
                () -> new TreeMap<>(cmp),
                Collectors.toList()
            ));
        Map<String, List<Pessoa>> resultado = new LinkedHashMap<>();
        for (String k : ordem){
            if (agrupado.containsKey(k)){
                resultado.put(k, agrupado.get(k));
            }
        }
        return resultado;
    }
}
