import configuration.Configuration;
import domain.Cat;
import domain.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Cat cat = (Cat) context.getBean("cat");
        Cat cat1 = (Cat) context.getBean("cat1");
        System.out.println(cat.getName());
        System.out.println(cat1.getName());

        Dog dog = (Dog) context.getBean("dog");
    }
}
