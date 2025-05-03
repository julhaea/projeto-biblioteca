package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.interfaces.PublicavelInterface;

import java.util.List;
import java.util.ArrayList;

public class UsuarioTest {

    @Test
    public void testAdicionarEmprestimo(){
        Usuario usuario = new Usuario("Gabriel", 21);
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 50, "Inglês", true), "Tecnologia");
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        List<Emprestimo> historico = new ArrayList<>();
        historico.add(emprestimo);
        usuario.adicionarEmprestimo(emprestimo);
        assertEquals(historico, usuario.getHistoricoEmprestimos());
    }

    @Test
    public void testGetHistoricoEmprestimos(){
        Autor autor = new Autor ("Jessica Felix", 25, "Brasileira", true);
        Livro livro = new Livro("Java for Begginers", autor, "Tecnologia");
        Usuario usuario =  new Usuario ("Lucas Rafael", 25);
        PublicavelInterface publicLivro = new EstrategiaPublicacaoLivro(livro);
        publicLivro.publicar();
        livro.emprestar(usuario);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        List<Emprestimo> historico = new ArrayList<>();
        historico.add(emprestimo);
        assertEquals(historico.get(0).getLivro().getTitulo(), usuario.getHistoricoEmprestimos().get(0).getLivro().getTitulo());
    

    }

    
}
