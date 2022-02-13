import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld first =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld second =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat tom = (Cat) applicationContext.getBean("cat");
        Cat felix = (Cat) applicationContext.getBean("cat");

        System.out.println(first.equals(second));
        System.out.println(tom.equals(felix));
    }
}