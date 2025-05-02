package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;



public class PessoaTest {
    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("Juju", 12);
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());

    }

    @Test
    public void testSetLivros(){
        Pessoa pessoa = new Pessoa("Jess", 25);
        Autor autor = new Autor("Jessica Felix", 25, "Brasileira" );
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java Básico", autor,"Tecnologia");
        livros[1] = new Livro("Java Avançado", autor, "Tecnologia");
        pessoa.setLivros(livros);
        assertArrayEquals(livros, pessoa.getLivros());
    }

 
}


