import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Aprendendo o básico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("POO");
        curso2.setDescricao("Conceitos de orientação a objetos");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Dúvidas e carreira");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Treinamento de Java");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Maercio");
        dev.inscreverBootcamp(bootcamp);

        dev.progredir();
        dev.progredir();

        System.out.println("XP total: " + dev.calcularXp());
    }
}