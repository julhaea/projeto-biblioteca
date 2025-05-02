package com.mycompany.app.Model;


public class Artigo extends Publicacao{
    private String genero;
    private boolean publicado;


    public Artigo(String título, Autor autor, String genero, boolean publicado){
        super(título, autor);
        this.genero = genero;
        this.publicado = publicado;
    }


    public String getGenero() {
        return genero;
    }


    public boolean isPublicado() {
        return publicado;
    }


    @Override
    public void validarPublicacao() {
        // Lógica específica de validação para Artigo
        System.out.println("Validando publicação de Artigo...");
    }
}
