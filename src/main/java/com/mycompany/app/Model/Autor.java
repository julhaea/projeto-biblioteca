package com.mycompany.app.Model;

import com.mycompany.app.interfaces.PublicavelInterface;

public class Autor extends Pessoa implements PublicavelInterface {
    private String nacionalidade;
    private boolean tradAutor;
    public void publicar() {
        System.out.println("Publicando como autor...");
    }

    public Autor(String nome, int idade, String nacionalidade, boolean tradAutor) {
        super(nome, idade);
        this.nacionalidade = nacionalidade;
        this.tradAutor = tradAutor;
    }

    public boolean getTradAutor(){
        return tradAutor;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
}