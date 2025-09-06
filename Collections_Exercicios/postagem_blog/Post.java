import java.util.Objects;

public class Post implements Comparable<Post> {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    // Construtor que recebe enum diretamente
    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    // Construtor alternativo que recebe string do autor e enum categoria
    public Post(String nomeAutor, String titulo, String corpo, Categorias categoria) {
        // Criar objeto Autor a partir do nome completo
        String[] partesNome = nomeAutor.split(" ", 2);
        if (partesNome.length == 2) {
            this.autor = new Autor(partesNome[0], partesNome[1]);
        } else {
            this.autor = new Autor(partesNome[0], "");
        }
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    // Construtor que recebe string da categoria (para compatibilidade)
    public Post(String nomeAutor, String titulo, String corpo, String categoria) {
        // Criar objeto Autor a partir do nome completo
        String[] partesNome = nomeAutor.split(" ", 2);
        if (partesNome.length == 2) {
            this.autor = new Autor(partesNome[0], partesNome[1]);
        } else {
            this.autor = new Autor(partesNome[0], "");
        }
        this.titulo = titulo;
        this.corpo = corpo;
        
        // Converter string para enum
        try {
            this.categoria = Categorias.valueOf(categoria.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Categoria inválida: " + categoria);
        }
    }

    @Override
    public String toString() {
        return titulo;  // Changed from "<titulo>"
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Post post = (Post) obj;
        return Objects.equals(autor, post.autor) && Objects.equals(titulo, post.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo);
    }

    @Override
    public int compareTo(Post outro) {
        return this.titulo.compareTo(outro.titulo);
    }

    // Getters e Setters
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}