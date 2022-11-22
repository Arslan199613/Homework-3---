package animals;

import java.util.Objects;

public class Mammals extends Animals{

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
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    private String livingEnvironment;
    private double speed;

    public Mammals(String name, int age, String livingEnvironment, double speed) {
        super(name, age);
        if (livingEnvironment == null && livingEnvironment.isEmpty() && livingEnvironment.isBlank()) {
            this.livingEnvironment = "default";
        } else {
            this.livingEnvironment = livingEnvironment;
            if (speed > 0) {
                this.speed = 60;
            } else {
                this.speed= speed;
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return Double.compare(mammals.speed, speed) == 0 && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livingEnvironment, speed);
    }

    public void walk() {
        System.out.println("Гулять");
    }

    @Override
    public void go() {
        System.out.println("Ходить лапами");
    }

    @Override
    public void eat() {
        System.out.println("есть еду");
    }

    @Override
    public String toString() {
        return livingEnvironment + "," + speed;
    }
}
