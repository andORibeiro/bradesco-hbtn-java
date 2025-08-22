import java.util.ArrayList;

public class GestaoAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        System.out.println("=== TESTE: GESTÃO DE ALUNOS ===\n");
        
        // 1. Adicionar três alunos
        System.out.println("1. Adicionando três alunos...");
        Aluno aluno1 = new Aluno("João Silva", 12);
        Aluno aluno2 = new Aluno("Maria Santos", 13);
        Aluno aluno3 = new Aluno("Pedro Oliveira", 15);
        
        Aluno.adicionarAluno(alunos, aluno1);
        Aluno.adicionarAluno(alunos, aluno2);
        Aluno.adicionarAluno(alunos, aluno3);
        System.out.println("Alunos adicionados com sucesso!\n");
        
        // 2. Exibir a lista de alunos
        System.out.println("2. Exibindo lista de alunos:");
        Aluno.listarAlunos(alunos);
        System.out.println();
        
        // 3. Buscar por um aluno
        System.out.println("3. Buscando aluno 'Maria Santos':");
        Aluno alunoEncontrado = Aluno.buscarAluno(alunos, "Maria Santos");
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        } else {
            System.out.println("Aluno não encontrado.");
        }
        System.out.println();
        
        // 4. Excluir um aluno
        System.out.println("4. Removendo aluno 'João Silva':");
        Aluno.removerAluno(alunos, aluno1);
        System.out.println("Aluno removido com sucesso!");
        System.out.println("Lista atualizada:");
        Aluno.listarAlunos(alunos);
        System.out.println();
        
        // 5. Tentar excluir um aluno inexistente e buscar outro aluno
        System.out.println("5. Tentando remover aluno inexistente 'Carlos Ferreira':");
        Aluno alunoInexistente = new Aluno("Carlos Ferreira", 99999);
        Aluno.removerAluno(alunos, alunoInexistente);
        System.out.println("Operação de remoção executada (sem efeito para aluno inexistente)");
        
        System.out.println("\nBuscando aluno 'Pedro Oliveira':");
        Aluno alunoEncontrado2 = Aluno.buscarAluno(alunos, "Pedro Oliveira");
        if (alunoEncontrado2 != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado2);
        } else {
            System.out.println("Aluno não encontrado.");
        }
        
        System.out.println("\nBuscando aluno inexistente 'Ana Costa':");
        Aluno alunoInexistente2 = Aluno.buscarAluno(alunos, "Ana Costa");
        if (alunoInexistente2 != null) {
            System.out.println("Aluno encontrado: " + alunoInexistente2);
        } else {
            System.out.println("Aluno não encontrado.");
        }
        
        System.out.println("\n=== LISTA FINAL DE ALUNOS ===");
        Aluno.listarAlunos(alunos);
    }
}
