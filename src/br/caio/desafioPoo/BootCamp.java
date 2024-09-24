package br.caio.desafioPoo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate datafinal = dataInicial.plusDays(45);

    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudis = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }

    public Set<Conteudo> getConteudis() {
        return conteudis;
    }

    public void setConteudis(Set<Conteudo> conteudis) {
        this.conteudis = conteudis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(datafinal, bootCamp.datafinal) && Objects.equals(devsIncritos, bootCamp.devsIncritos) && Objects.equals(conteudis, bootCamp.conteudis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, datafinal, devsIncritos, conteudis);
    }
}
