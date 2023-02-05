import java.time.LocalDate;

import com.github.antoniocsilva.dominio.Bootcamp;
import com.github.antoniocsilva.dominio.Curso;
import com.github.antoniocsilva.dominio.Dev;
import com.github.antoniocsilva.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso(8, "Curso Java", "POO com Java");
        // curso1.setTitulo("Curso Java");
        // curso1.setDescricao("POO com Java");
        // curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("POO com JS");
        curso2.setCargaHoraria(4);

        // Mentoria mentoria = new Mentoria();
        // mentoria.setTitulo("Mentoria java");
        // mentoria.setDescricao("Pilares da POO com Java");
        // mentoria.setData(LocalDate.now());

        Mentoria mentoria = new Mentoria("Mentoria java", "Pilares da POO com Java", LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Antonio Silva");
        dev1.incricaoBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + dev1.getConteudoInscrito());
        dev1.progredir();
        // System.out.println("Conteudos inscritos " + dev1.getConteudoInscrito());
        System.out.println("Conteudos concluidos " + dev1.getConteudoConcluido());
        System.out.println("XP:" + dev1.calculaXpTotal());

        Dev dev2 = new Dev();
        dev2.setNome("Analu");
        dev2.incricaoBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + dev2.getConteudoInscrito());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("----------");
        System.out.println("Conteudos inscritos " + dev2.getConteudoInscrito());
        System.out.println("----------");
        System.out.println("Conteudos Concluidos " + dev2.getConteudoConcluido());
        System.out.println("XP:" + dev2.calculaXpTotal());

    }
}
