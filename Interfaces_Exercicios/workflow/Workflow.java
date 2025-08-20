import java.util.ArrayList;
import java.util.List;
import atividades.*;

public class Workflow{
    private List<Atividade> atividades;

    public Workflow() {
        atividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}