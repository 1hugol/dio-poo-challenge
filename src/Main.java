
import br.com.dio.challenge.model.Course;
import br.com.dio.challenge.model.Mentoring;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java Completo", "Java do iniciante ao avançado", 100);
        Course course2 = new Course("Spring Boot", "Spring Boot do iniciante ao avançado", 200);

        Mentoring mentoring1 = new Mentoring("Mentoria em Java", "Mentoria do curso de Java", LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring1);

    }
}
