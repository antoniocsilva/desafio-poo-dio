package com.github.antoniocsilva.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(int cargaHoraria, String titulo, String descricao) {
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo()
                + ", descricao=" + getDescricao()
                + ", cargaHoraria=" + cargaHoraria
                + "]";
    }

    @Override
    public double calculaXp() {
        return XP_PAPRAO * cargaHoraria;
    }

}
