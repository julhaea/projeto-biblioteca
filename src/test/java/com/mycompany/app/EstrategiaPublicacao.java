package com.mycompany.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.EstrategiaPublicacaoArtigo;
import com.mycompany.app.Model.EstrategiaPublicacaoLivro;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;
import com.mycompany.app.interfaces.PublicavelInterface;

public class EstrategiaPublicacao {
    @Test
    public void testEstrategiaPublicacaoLivro(){
        Autor autor = new Autor ("Jessica Felix", 36, "Brasileira", true);
        Livro livro = new Livro("Java for Begginers", autor, "Tecnologia");
        assertFalse(livro.getDisponivel());
        PublicavelInterface publicLivro = new EstrategiaPublicacaoLivro();
        publicLivro.publicar(livro);
        assertTrue(livro.getDisponivel());
    }

    @Test
    public void testEstrategiaPublicacaoArtigo(){
        Usuario usuario =  new Usuario ("Lucas Rafael", 25);
        Artigo artigo = new Artigo ("Entendendo Compiladores", new Autor (usuario.getNome(), usuario.getIdade(), "Brasileiro", false), "Tecnologia");
        assertFalse(artigo.isPublicado());
        PublicavelInterface publicArtigo = new EstrategiaPublicacaoArtigo();
        publicArtigo.publicar(artigo);
        assertTrue(artigo.isPublicado());
    }


}
