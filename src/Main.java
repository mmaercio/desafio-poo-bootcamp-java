import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Curso;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Fundamentos de Java");
        cursoJavaBasico.setDescricao("Conceitos iniciais da linguagem Java");
        cursoJavaBasico.setCargaHoraria(8);

        Curso cursoPOO = new Curso();
        cursoPOO.setTitulo("POO com Java");
        cursoPOO.setDescricao("Aplicando os pilares da orientação a objetos");
        cursoPOO.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Carreira em Java");
        mentoriaJava.setDescricao("Troca de experiência sobre estudos e mercado");
        mentoriaJava.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp voltado para prática de Java e POO");

        bootcampJava.getConteudos().add(cursoJavaBasico);
        bootcampJava.getConteudos().add(cursoPOO);
        bootcampJava.getConteudos().add(mentoriaJava);

        Dev desenvolvedor = new Dev();
        desenvolvedor.setNome("Maercio Rogers");
        desenvolvedor.inscreverBootcamp(bootcampJava);

        System.out.println("Conteúdos inscritos: " + desenvolvedor.getConteudosInscritos());
        System.out.println("XP inicial: " + desenvolvedor.calcularXp());

        desenvolvedor.progredir();
        desenvolvedor.progredir();

        System.out.println("Conteúdos concluídos: " + desenvolvedor.getConteudosConcluidos());
        System.out.println("XP final: " + desenvolvedor.calcularXp());
    }
}