package com.mycompany.app.Model;
public class Autor extends Pessoa  {
    private String nacionalidade;

    public Autor(String nome, int idade, String nacionalidade) {
        super(nome, idade);
        this.nacionalidade = nacionalidade;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}