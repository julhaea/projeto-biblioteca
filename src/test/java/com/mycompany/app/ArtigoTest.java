package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.EstrategiaPublicacaoArtigo;
import com.mycompany.app.interfaces.PublicavelInterface;
import com.mycompany.app.Model.Artigo;

public class ArtigoTest {
    @Test
    public void testGetGenero() {
        Autor autor = new Autor("Lucas Rafael", 21, "Brasileiro", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia");
        assertEquals("Tecnologia", artigo.getGenero());

    }

    @Test
    public void testIsPublicado() {
        Autor autor = new Autor("Lucas Rafael", 21, "Brasileiro", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia");
        PublicavelInterface publicArtigo = new EstrategiaPublicacaoArtigo();
        publicArtigo.publicar(artigo);
        assertTrue(artigo.isPublicado());

    }

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Lucas Rafael", 21, "Brasileiro", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia");
        assertEquals("Entendendo Compiladores", artigo.getTitulo());

    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Lucas Rafael", 21, "Brasileiro", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia");
        assertEquals(autor, artigo.getAutor());

    }
}
