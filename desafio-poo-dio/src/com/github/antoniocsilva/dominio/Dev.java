package com.github.antoniocsilva.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

    public void incricaoBootcamp(Bootcamp bootcamp) {
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluido.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else {
            System.out.println("Você não está matricula em nenhum bootcamp!");
        }
    }

    public double calculaXpTotal() {
        return this.conteudosConcluido
                .stream()
                .mapToDouble(conteudo -> conteudo.calculaXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudosInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudosInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudosConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudosConcluido = conteudoConcluido;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscrito == null) ? 0 : conteudosInscrito.hashCode());
        result = prime * result + ((conteudosConcluido == null) ? 0 : conteudosConcluido.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscrito == null) {
            if (other.conteudosInscrito != null)
                return false;
        } else if (!conteudosInscrito.equals(other.conteudosInscrito))
            return false;
        if (conteudosConcluido == null) {
            if (other.conteudosConcluido != null)
                return false;
        } else if (!conteudosConcluido.equals(other.conteudosConcluido))
            return false;
        return true;
    }

}
