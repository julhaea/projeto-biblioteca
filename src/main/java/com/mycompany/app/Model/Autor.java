package com.mycompany.app.Model;
public class Autor extends Pessoa  {
    private String nacionalidade;
    private boolean tradAutor;

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