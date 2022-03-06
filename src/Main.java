import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Seja fullstack developer");
        cursoJava.setCargaHoraria(400);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitulo("Curso Spring");
        cursoSpring.setDescricao("Desenvolva com Spring");
        cursoSpring.setCargaHoraria(300);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Desenvolva-se com a melhor linguagem do mercado.");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.inscreverBootcamp(bootcamp);
        devBruno.setNome("Bruno");

        Dev devFelix = new Dev();
        devFelix.inscreverBootcamp(bootcamp);
        devFelix.setNome("Felix");

        System.out.println("Conteúdos Inscritos:" + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devBruno.getConteudosConcluidos());
        System.out.println("XP:" + devBruno.calcularTotalXp());

        System.out.println("-------");

        System.out.println("Conteúdos Inscritos:" + devFelix.getConteudosInscritos());
        devFelix.progredir();
        devFelix.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devFelix.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devFelix.getConteudosConcluidos());
        System.out.println("XP:" + devFelix.calcularTotalXp());

    }

}
