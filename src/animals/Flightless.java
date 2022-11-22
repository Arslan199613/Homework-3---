package animals;

import java.util.Objects;

public class Flightless extends Birds{
    public String typeOfMovement;

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement == null && typeOfMovement.isEmpty() && typeOfMovement.isBlank()) {
            this.typeOfMovement = "default";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }
    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null && typeOfMovement.isEmpty() && typeOfMovement.isBlank()) {
            this.typeOfMovement = "default";
        } else {
            this.typeOfMovement = typeOfMovement;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }

    public void walk() {
        System.out.println("Гулять:)");
    }

    @Override
    public String toString() {
        return typeOfMovement;
    }
}
