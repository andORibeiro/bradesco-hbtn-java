import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    // Métodos estáticos para manipulação da lista de alunos
    public static void adicionarAluno(ArrayList<Aluno> alunos, Aluno aluno) {
        alunos.add(aluno);
    }

    public static void removerAluno(ArrayList<Aluno> alunos, Aluno aluno) {
        alunos.removeIf(a -> a.getNome().equals(aluno.getNome()));
    }

    public static Aluno buscarAluno(ArrayList<Aluno> alunos, String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }
    
    public static void listarAlunos(ArrayList<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
