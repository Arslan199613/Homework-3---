package animals;

import java.util.Objects;

public class Amphibians extends Animals{
    private String livingEnvironment;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null && livingEnvironment.isEmpty() && livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment= livingEnvironment;
        }
    }
    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null && livingEnvironment.isEmpty() && livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public void hunt() {
        System.out.println("охотиться на рыб");
    }

    @Override
    public void eat() {
        System.out.println("есть комаров");
    }

    @Override
    public void go() {
        System.out.println("передвигаться до по земле, то по воде");
    }

    @Override
    public String toString() {
        return livingEnvironment;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(livingEnvironment, that.livingEnvironment);
    }
    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }
}


