package com.mycompany.app.Model;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Livro[] livros;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
