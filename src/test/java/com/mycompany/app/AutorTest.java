package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AutorTest {
    @Test
    public void testSetNome() {
        Autor autor = new Autor("Jess", 25, "Brasileira");
        autor.setNome("Juju");
        assertEquals("Juju", autor.getNome());

    }

    @Test
    public void testGetNome() {
        Autor autor = new Autor("Jess", 25, "Brasileira");
        assertEquals("Jess", autor.getNome());

    }

    @Test
    public void testSetNacionalidade() {
        Autor autor = new Autor("Jess", 25, "Brasileira");
        autor.setNacionalidade("Uruguaia");
        assertEquals("Uruguaia", autor.getNacionalidade());

    }

    @Test
    public void testGetNacionalidade() {
        Autor autor = new Autor("Jess", 25, "Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());

    }
}
