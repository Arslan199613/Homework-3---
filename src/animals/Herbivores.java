package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
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
    public Herbivores(String name, int age, String livingEnvironment, double speed, String typeOfFood) {
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
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    public void graze() {
        System.out.println("Пастись");

    }

    @Override
    public String toString() {
        return typeOfFood;
    }
}
