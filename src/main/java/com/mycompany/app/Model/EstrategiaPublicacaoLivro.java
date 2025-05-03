package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;

public class EstrategiaPublicacaoLivro implements PublicavelInterface{
    @Override
    public void publicar(Publicacao publicacao) {
        Livro livro = (Livro) publicacao;
        livro.setDisponivel(true);
        System.out.println("Livro publicado: " + livro.getTitulo());
    }



    
}
