package com.mycompany.app;
import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
        this.dataRetirada = LocalDate.now();
        this.dataDevolucao = null;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void registrarDevolucao() {
        this.dataDevolucao = LocalDate.now();
    }

}