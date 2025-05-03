package com.mycompany.app.Model;


public class Artigo extends Publicacao{
    private String genero;
    private boolean publicado;


    public Artigo(String título, Autor autor, String genero){
        super(título, autor);
        this.genero = genero;
        this.publicado = false;
    }


    public String getGenero() {
        return genero;
    }


    public boolean isPublicado() {
        return publicado;
    }

    public void setPublicado(boolean publicado){
        this.publicado = publicado;
    }


    @Override
    public void validarPublicacao() {
        // Lógica específica de validação para Artigo
        System.out.println("Validando publicação de Artigo...");
    }
}
