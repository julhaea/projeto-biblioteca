package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mycompany.app.Model.Autor;

public class AutorTest {
    @Test
    public void testSetNome() {
        Autor autor = new Autor("Jess", 25, "Brasileira", true);
        autor.setNome("Juju");
        assertEquals("Juju", autor.getNome());

    }

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Jess", 25, "Brasileira", true);
        assertEquals("Jess", autor.getNome());

    }

    @Test
    public void testSetNacionalidade() {
        Autor autor = new Autor("Jess", 25, "Brasileira", true);
        autor.setNacionalidade("Uruguaia");
        assertEquals("Uruguaia", autor.getNacionalidade());

    }

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess", 25, "Brasileira", true);
        assertEquals("Brasileira", autor.getNacionalidade());

    }

    @Test
    public void testGetTradAutor(){
        Autor autor = new Autor("Jess", 25, "Brasileira", true);
        assertTrue(autor.getTradAutor());

    }
}
