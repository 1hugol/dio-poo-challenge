
import br.com.dio.challenge.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Curso de Java", "Java do iniciante ao avançado", 100);
        Course course2 = new Course("Curso de Spring Boot", "Spring Boot do iniciante ao avançado", 200);

        Mentoring mentoring1 = new Mentoring("Mentoria Clean Code", "Mentoria sobre Código Limpo", LocalDate.now());

        Bootcamp bootcampBackEnd = new Bootcamp("Bootcamp Back-End Dev", "Ferramentas Back-End");
        bootcampBackEnd.getContents().add(course1);
        bootcampBackEnd.getContents().add(course2);
        bootcampBackEnd.getContents().add(mentoring1);

        Dev devHugo = new Dev("Hugo");
        devHugo.registerBootcamp(bootcampBackEnd);
        System.out.println("Conteúdos Inscritos Hugo:" + devHugo.getSubscribedContents());

        devHugo.advance();
        devHugo.advance();
        devHugo.advance();

        System.out.println("------------");

        System.out.println("Conteúdos Inscritos Hugo:" + devHugo.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Hugo:" + devHugo.getCompletedContent());
        System.out.println("XP do Dev: " + devHugo.getName() + " é igual a: " + devHugo.totalXpCalculate());



        System.out.println("------------");

        Dev devLeticia = new Dev("Letícia");
        devLeticia.registerBootcamp(bootcampBackEnd);
        System.out.println("Conteúdos Inscritos Letícia:" + devLeticia.getSubscribedContents());

        devLeticia.advance();
        devLeticia.advance();

        System.out.println("------------");

        System.out.println("Conteúdos Inscritos Letícia:" + devLeticia.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Letícia:" + devLeticia.getCompletedContent());
        System.out.println("XP do Dev: " + devLeticia.getName() + " é igual a: " + devLeticia.totalXpCalculate());
    }
}
