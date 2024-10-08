package br.caio.desafioPoo;


import java.util.*;
import java.util.LinkedHashSet;

public class Dev {
    String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set <Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(BootCamp bootCamp){
        this.conteudoInscrito.addAll(bootCamp.getConteudis());
        bootCamp.getDevsIncritos().add(this);
    }

    public void progredir(){
        //optional serve para resolver o problema de retorno nulos
        Optional<Conteudo> cont = this.conteudoInscrito.stream().findFirst();
        if(cont.isPresent()){
            this.conteudoConcluido.add(cont.get());
            this.conteudoInscrito.remove(cont.get());
        }
        else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudoConcluido.stream()
                .mapToDouble(Conteudo::calculaXP)
                .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
        this.conteudoConcluido = conteudoConcluido;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoConcluido, dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoConcluido);
    }
}
