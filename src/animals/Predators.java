package animals;

import java.util.Objects;

public class Predators extends Mammals{
    private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null && typeOfFood.isEmpty() && typeOfFood.isBlank()) {
            this.typeOfFood = "default";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }
    public Predators(String name, int age, String livingEnvironment, double speed, String typeOfFood) {
        super(name, age, livingEnvironment, speed);
        if (typeOfFood == null && typeOfFood.isEmpty() && typeOfFood.isBlank()) {
            this.typeOfFood = "default";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public void hunt() {
        System.out.println("охотиться");
    }

    @Override
    public String toString() {
        return typeOfFood;
    }
}
