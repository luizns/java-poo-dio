import com.github.luizns.poo.dominio.Bootcamp;
import com.github.luizns.poo.dominio.Curso;
import com.github.luizns.poo.dominio.Dev;
import com.github.luizns.poo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria)*/
        ;

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("--");

        Dev dev1 = new Dev();
        dev1.setNome("Luiz Silva");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos dev1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("*****************************");
        System.out.println("Conteúdos Inscritos dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos dev1: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("--------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Luiz Silva");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos dev2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }

}
