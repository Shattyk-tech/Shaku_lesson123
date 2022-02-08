package peaksoft.animals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    private String name;
    private int age;
    private String breed;

    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }
    @Value("${Cat.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("${Cat.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
    @Value("${Cat.breed}")
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void animalPlus() {

    }

    @Override
    public void animalMinus() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
