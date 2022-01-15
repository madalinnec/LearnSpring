package configuration;

import domain.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "domain")
public class Configuration {

    @Bean
    public Cat cat(){
        Cat cat = new Cat();
        cat.setName("Fibi");
        return cat;
    }

    @Bean
    public Cat cat1(){
        Cat cat = new Cat();
        cat.setName("Nasturel");
        return cat;
    }
}
