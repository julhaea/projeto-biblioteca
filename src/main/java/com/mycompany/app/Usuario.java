package com.mycompany.app;
import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome, idade);
        this.historicoEmprestimos = new ArrayList<>();
    }


    public List<Emprestimo> getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }


}