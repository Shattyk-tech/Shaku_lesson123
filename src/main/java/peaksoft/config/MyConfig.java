package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import peaksoft.Person;
import peaksoft.animals.Dog;

@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Bean
    public Dog getDog(){
        return new Dog();
    }
    @Bean
    public Person getPerson(){
        return new Person();
    }

}
