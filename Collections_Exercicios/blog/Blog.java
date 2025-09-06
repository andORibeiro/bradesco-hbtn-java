import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog{
     private ArrayList<Post> postagens;

     public Blog(){
         postagens = new ArrayList<>();
     }

    public void adicionarPostagem(Post postagem){
        postagens.add(postagem);
    }

    public Set<String> obterTodosAutores() {
         Set<String> autores = new TreeSet<>();
         for (Post postagem : postagens) {
             autores.add(postagem.getAutor());
         }
         return autores;
     }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();
        for (Post postagem : postagens) {
            String categoria = postagem.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }
}