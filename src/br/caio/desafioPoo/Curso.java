package br.caio.desafioPoo;

public class Curso extends Conteudo{


    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calculaXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
