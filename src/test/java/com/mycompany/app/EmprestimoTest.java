package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Emprestimo;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class EmprestimoTest {

    @Test
    public void testGetDataRetirada(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 50, "Inglês", true), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        assertEquals(LocalDate.now(), emprestimo.getDataRetirada());

    }

    @Test
    public void testGetDataDevolucao(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 50, "Inglês", true), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimo.setDataDevolucao(LocalDate.now());
        assertEquals(LocalDate.now(), emprestimo.getDataDevolucao());

    }

    @Test
    public void testSetDataDevolucao(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 50, "Inglês", true), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        emprestimo.setDataDevolucao(LocalDate.now());
        assertEquals(LocalDate.now(), emprestimo.getDataDevolucao());

    }

    @Test
    public void testGetLivro(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 50, "Inglês", true), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        assertEquals(livro, emprestimo.getLivro());

    }

    @Test
    public void testGetUsuario(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", 50, "Inglês", true), "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        assertEquals(usuario, emprestimo.getUsuario());

    }
}
