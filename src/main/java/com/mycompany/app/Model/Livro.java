package com.mycompany.app.Model;

public class Livro extends Publicacao{
    private String genero;
    private boolean disponivel;
    private Usuario usuarioPosse;
    private Emprestimo emprestimo;

    public Livro(String titulo, Autor autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
        this.disponivel = false;

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

    @Override
    public void validarPublicacao() {

        // Lógica específica de validação para Livro

        System.out.println("Validando publicação de Livro...");

    }


}
