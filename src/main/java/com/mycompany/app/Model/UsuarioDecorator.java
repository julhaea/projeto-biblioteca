package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;
import com.mycompany.app.interfaces.*;

public class UsuarioDecorator implements PublicavelInterface {
    private AutorInterface usuario;
    private PublicavelInterface estrategiaPublicacao;


    public UsuarioDecorator(AutorInterface usuario) {
        this.usuario = usuario;

    }


    @Override
    public void publicar(Publicacao publicacao) {
        estrategiaPublicacao.publicar(publicacao);
        System.out.println("Publicando como usuário...");

    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategia){
        this.estrategiaPublicacao = estrategia;
    }

    public PublicavelInterface getEstrategiaPublicacao(){
        return estrategiaPublicacao;
    }
}
