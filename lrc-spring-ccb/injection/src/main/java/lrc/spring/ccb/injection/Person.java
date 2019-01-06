package lrc.spring.ccb.injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private int age;
    private Pet pet;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
