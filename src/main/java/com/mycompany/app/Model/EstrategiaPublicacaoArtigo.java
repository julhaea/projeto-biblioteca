package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;

public class EstrategiaPublicacaoArtigo implements PublicavelInterface{

    public void publicar(Publicacao publicacao) {
        Artigo artigo = (Artigo) publicacao;
        artigo.setPublicado(true);
        System.out.println("Publicando artigo...");

    }


    
}