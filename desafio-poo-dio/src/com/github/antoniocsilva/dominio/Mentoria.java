package com.github.antoniocsilva.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo()
                + ", descricao=" + getDescricao()
                + ", data=" + data + "]";
    }

    @Override
    public double calculaXp() {
        return XP_PAPRAO + 20d;
    }

}
