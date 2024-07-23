import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "catClass")
    @Scope("prototype")
    public CatClass getCatClass() {
        CatClass catClass = new CatClass();
        catClass.setAge(205);
        catClass.setName("Cat");
        return catClass;
    }
}