import java.util.ArrayList;

public class GestaoAlunos {
    private ArrayList<Aluno> alunos;

    public GestaoAlunos() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.removeIf(a -> a.getNome().equals(aluno.getNome()));
    }

    public Aluno buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                return aluno;
            }
        }
        return null;
    }
    
    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}

class Main {
    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();
        
        System.out.println("=== TESTE: GESTÃO DE ALUNOS ===\n");
        
        // 1. Adicionar três alunos
        System.out.println("1. Adicionando três alunos...");
        Aluno aluno1 = new Aluno("João Silva", 12);
        Aluno aluno2 = new Aluno("Maria Santos", 13);
        Aluno aluno3 = new Aluno("Pedro Oliveira", 15);
        
        gestao.adicionarAluno(aluno1);
        gestao.adicionarAluno(aluno2);
        gestao.adicionarAluno(aluno3);
        System.out.println("Alunos adicionados com sucesso!\n");
        
        // 2. Exibir a lista de alunos
        System.out.println("2. Exibindo lista de alunos:");
        gestao.listarAlunos();
        System.out.println();
        
        // 3. Buscar por um aluno
        System.out.println("3. Buscando aluno 'Maria Santos':");
        Aluno alunoEncontrado = gestao.buscarAluno("Maria Santos");
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        } else {
            System.out.println("Aluno não encontrado.");
        }
        System.out.println();
        
        // 4. Excluir um aluno
        System.out.println("4. Removendo aluno 'João Silva':");
        gestao.removerAluno(aluno1);
        System.out.println("Aluno removido com sucesso!");
        System.out.println("Lista atualizada:");
        gestao.listarAlunos();
        System.out.println();
        
        // 5. Tentar excluir um aluno inexistente e buscar outro aluno
        System.out.println("5. Tentando remover aluno inexistente 'Carlos Ferreira':");
        Aluno alunoInexistente = new Aluno("Carlos Ferreira", 99999);
        gestao.removerAluno(alunoInexistente);
        System.out.println("Operação de remoção executada (sem efeito para aluno inexistente)");
        
        System.out.println("\nBuscando aluno 'Pedro Oliveira':");
        Aluno alunoEncontrado2 = gestao.buscarAluno("Pedro Oliveira");
        if (alunoEncontrado2 != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado2);
        } else {
            System.out.println("Aluno não encontrado.");
        }
        
        System.out.println("\nBuscando aluno inexistente 'Ana Costa':");
        Aluno alunoInexistente2 = gestao.buscarAluno("Ana Costa");
        if (alunoInexistente2 != null) {
            System.out.println("Aluno encontrado: " + alunoInexistente2);
        } else {
            System.out.println("Aluno não encontrado.");
        }
        
        System.out.println("\n=== LISTA FINAL DE ALUNOS ===");
        gestao.listarAlunos();
    }
}
