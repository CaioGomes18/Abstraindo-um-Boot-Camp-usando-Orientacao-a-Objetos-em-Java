package br.caio.desafioPoo;

public abstract class Conteudo {


    //Static significa que pode ser acessado fora da classe
    protected static final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public abstract double calculaXP();


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
