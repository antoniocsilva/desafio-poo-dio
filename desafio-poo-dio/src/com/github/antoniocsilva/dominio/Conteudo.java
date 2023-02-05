package com.github.antoniocsilva.dominio;

public abstract class Conteudo {

    protected static final double XP_PAPRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calculaXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
