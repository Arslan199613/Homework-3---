package animals;

import java.util.Objects;

public class Animals {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 17;
        } else {
            this.age = age;
        }
    }
    public Animals(String name, int age) {
        this.name = name;
        if (age < 0) {
            this.age = 17;
        } else {
            this.age = age;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void eat() {
        System.out.println("есть");

    }
    public void go() {
        System.out.println("Передвигаться");
    }

    @Override
    public String toString() {
        return name + age;

    }
}
