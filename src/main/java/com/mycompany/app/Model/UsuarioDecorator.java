package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;

class UsuarioDecorator implements PublicavelInterface {
    private PublicavelInterface usuario;
    private PublicavelInterface estrategiaPublicacao;


    public UsuarioDecorator(PublicavelInterface usuario) {
        this.usuario = usuario;

    }


    public void publicar() {
        usuario.publicar();
        System.out.println("Publicando como usuário...");

    }

    public void setEstrategiaPublicacao(PublicavelInterface estrategia){
        this.estrategiaPublicacao = estrategia;
    }



}
