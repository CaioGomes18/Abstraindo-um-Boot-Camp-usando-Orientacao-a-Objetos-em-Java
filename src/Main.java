import br.caio.desafioPoo.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();
        Mentoria mentoria2 = new Mentoria();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);


        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(6);


        Conteudo cont = new Curso();



        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        BootCamp boot = new BootCamp();

        boot.setNome("BootCamp java Developer");
        boot.setDescricao("descrição boot Camp Java Developer");
        boot.getConteudis().add(curso1);
        boot.getConteudis().add(curso2);
        boot.getConteudis().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Caio");
        dev1.inscreverBootcamp(boot);
        System.out.println("Conteudos insritos Caio" + dev1.getConteudoInscrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Concluidos Caio" + dev1.getConteudoConcluido());
        System.out.println("Conteudos insritos Caio" + dev1.getConteudoInscrito());
        System.out.println("XP" + dev1.calcularTotalXp());



        Dev dev2 = new Dev();
        dev1.setNome("Joao");
        dev2.inscreverBootcamp(boot);
        System.out.println("Conteudos insritos joao" + dev2.getConteudoInscrito());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluidos joao" + dev2.getConteudoConcluido());
        System.out.println("Conteudos insritos joao" + dev2.getConteudoInscrito());
        System.out.println("XP" + dev2.calcularTotalXp());


    }
}