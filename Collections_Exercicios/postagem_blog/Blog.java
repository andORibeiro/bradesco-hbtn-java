import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> postagens;

    public Blog() {
        postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        // Verificar se postagem já existe (mesmo autor + mesmo título)
        for (Post existente : postagens) {
            if (existente.equals(postagem)) {
                throw new PostagemJaExistenteException("Postagem jah existente");
            }
        }
        postagens.add(postagem);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post postagem : postagens) {
            autores.add(postagem.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new HashMap<>();
        for (Post postagem : postagens) {
            Categorias categoria = postagem.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getAutor().equals(autor)) {
                posts.add(post);
            }
        }
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();
        for (Post post : postagens) {
            if (post.getCategoria().equals(categoria)) {
                posts.add(post);
            }
        }
        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> resultado = new HashMap<>();
        for (Categorias categoria : Categorias.values()) {
            resultado.put(categoria, obterPostsPorCategoria(categoria));
        }
        return resultado;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> resultado = new TreeMap<>();
        Set<Autor> autores = obterTodosAutores();
        for (Autor autor : autores) {
            resultado.put(autor, obterPostsPorAutor(autor));
        }
        return resultado;
    }
}