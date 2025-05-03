package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;

public class EstrategiaPublicacaoLivro implements PublicavelInterface{
    private Livro livro;

    public EstrategiaPublicacaoLivro(Livro livro) {
        this.livro = livro;

    }

    public void publicar() {
        livro.setDisponivel(true);
        System.out.println("Publicando e disponibilizando livro...");

    }


    
}
