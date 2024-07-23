import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        CatClass bean2 =
                (CatClass) applicationContext.getBean("catClass");
        CatClass bean3 =
                (CatClass) applicationContext.getBean("catClass");
        System.out.println(bean.getMessage());
        System.out.println(bean1.equals(bean2));
        System.out.println(bean1.equals(bean));
    }
}

