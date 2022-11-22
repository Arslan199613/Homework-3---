import animals.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель", 10, "Африка", 80, "трава");
        Herbivores giraffe = new Herbivores("Жираф", 15, "Африка", 70, "трава");
        Herbivores horse = new Herbivores("Лошадь", 12, "Россия", 80, "трава");

        Predators hyena = new Predators("Гиена", 12, "Африка", 70, "мясо");
        Predators tiger = new Predators("Тигр", 10, "Африка", 90, "мясо");
        Predators bear = new Predators("Медведь", 12, "Россия", 50, "мясо");

        Amphibians frog = new Amphibians("Лягушка", 5, "болото");
        Amphibians snake = new Amphibians("Уж", 3, "водоём");

        Flightless peacock = new Flightless("Павлин", 12, "поле", "не летают");
        Flightless penguin = new Flightless("Пингвин", 10, "Аляска", "не летают");
        Flightless dodo = new Flightless("Птица додо", 11, "лес", "не летают");

        Flying seagull = new Flying("Чайка", 15, "Россия", "летают");
        Flying albatross = new Flying("Альбатрос", 10, "Антарктида", "летают");
        Flying falcon = new Flying("Сокол", 10, "Россия", "летают");


        printInfoHerbivores(gazel);
        printInfoHerbivores(giraffe);
        printInfoHerbivores(horse);

        printInfoPredators(hyena);
        printInfoPredators(tiger);
        printInfoPredators(bear);

        printInfoAmphibians(frog);
        printInfoAmphibians(snake);

        printInfoFlightless(peacock);
        printInfoFlightless(penguin);
        printInfoFlightless(dodo);

        printInfoFlying(seagull);
        printInfoFlying(albatross);
        printInfoFlying(falcon);

        System.out.println("Рандомный вызов методов для проверки");
        tiger.eat();
        tiger.go();

        snake.eat();
        snake.go();

        penguin.eat();
        penguin.go();


    }

    public static void printInfoHerbivores(Herbivores herbivores) {
        System.out.println("Название животного-" + herbivores.getName() +
                ", возраст- " + herbivores.getAge() + ", среда обитания-" +
                herbivores.getLivingEnvironment() + ", скорость " +
                herbivores.getSpeed() + ", тип пищи " + herbivores.getTypeOfFood());
    }

    public static void printInfoPredators(Predators predators) {
        System.out.println("Название животного-" + predators.getName() +
                ", возраст- " + predators.getAge() + ", среда обитания-" + predators.getLivingEnvironment() + ", скорость " +
                predators.getSpeed() + ", тип пищи " + predators.getTypeOfFood());

    }

    public static void printInfoAmphibians(Amphibians amphibians) {
        System.out.println("Название животного-" + amphibians.getName() +
                ", возраст- " + amphibians.getAge() + ", среда обитания-" + amphibians.getLivingEnvironment());
    }

    public static void printInfoFlightless(Flightless flightless) {
        System.out.println("Название птицы-" + flightless.getName() +
                ", возраст- " + flightless.getAge() + ", среда обитания-"
                + flightless.getLivingEnvironment() + ", тип передвижения-" + flightless.getTypeOfMovement());
    }

    public static void printInfoFlying(Flying flying) {
        System.out.println("Название птицы-" + flying.getName() +
                ", возраст- " + flying.getAge() + ", среда обитания-"
                + flying.getLivingEnvironment() + ", тип передвижения-"
                + flying.getTypeOfMovement() + ", тип передвижения -" + flying.typeOfMovement);
    }
}