package peaksoft.animals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog() {

    }

    public String getName() {
        return name;
    }
    @Value("${Dog.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("${Dog.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
    @Value("${Dog.breed}")
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
