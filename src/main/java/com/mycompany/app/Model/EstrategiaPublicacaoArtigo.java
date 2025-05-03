package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;

public class EstrategiaPublicacaoArtigo implements PublicavelInterface{
    private Artigo artigo;

    public EstrategiaPublicacaoArtigo(Artigo artigo) {
        this.artigo = artigo;

    }

    public void publicar() {
        artigo.setPublicado(true);
        System.out.println("Publicando artigo...");

    }


    
}