package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.interfaces.PublicavelInterface;

public class LivroTest {
    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        assertEquals("Java Basics", livro.getTitulo());

    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        assertEquals(autor, livro.getAutor());

    }

    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        assertEquals("Tecnologia", livro.getGenero());

    }

    @Test
    public void testGetDisponivel() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        assertFalse(livro.getDisponivel());

    }

    @Test
    public void testSetDisponivel() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        livro.setDisponivel(true);
        assertTrue(livro.getDisponivel());

    }

    @Test
    public void testEmprestar() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        PublicavelInterface publicLivro = new EstrategiaPublicacaoLivro();
        publicLivro.publicar(livro);
        livro.emprestar(usuario);
        assertFalse(livro.getDisponivel());

    }

    @Test
    public void testDevolver() {
        Autor autor = new Autor("Alan Turing", 50, "Inglês", true);
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        PublicavelInterface publicLivro = new EstrategiaPublicacaoLivro();
        publicLivro.publicar(livro);
        livro.emprestar(usuario);
        livro.devolver();
        assertTrue(livro.getDisponivel());

    }




}
