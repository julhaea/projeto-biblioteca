public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;
    private Usuario usuarioPosse;
    private Emprestimo emprestimo;

    public Livro(String titulo, Autor autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;

    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }
    public boolean getDisponivel() {
        return disponivel;
    }






    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(Usuario usuario) {
        if (this.disponivel) {
            this.disponivel = false;
            this.usuarioPosse = usuario;
            this.emprestimo = new Emprestimo(this, usuario);
            usuario.adicionarEmprestimo(this.emprestimo);
            System.out.println("Emprestimo realizado para: " + this.usuarioPosse.getNome());
        } else {
            System.out.println("Livro emprestado para: " + this.usuarioPosse.getNome());
        }

    }

    public void devolver() {
        if (!this.disponivel) {
            this.emprestimo.registrarDevolucao();
            this.disponivel = true;
            this.usuarioPosse = null;
            this.emprestimo = null;
            System.out.println("Livro devolvido");
        } else {
        System.out.println("O livro nao esta emprestado.");
        }
    }

}
