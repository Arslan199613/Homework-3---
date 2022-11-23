package animals;

import java.util.Objects;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment == null && livingEnvironment.isEmpty() && livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment == null && livingEnvironment.isEmpty() && livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public void hunt() {
        System.out.println("охотиться на насекомых");
    }

    @Override
    public void go() {
        System.out.println("Летать");
    }

    @Override
    public void eat() {
        System.out.println("Есть траву");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public String toString() {
        return livingEnvironment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment);
    }


}

