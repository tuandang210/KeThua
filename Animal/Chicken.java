package Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken chipp";
    }

    @Override
    public String howtoEat() {
        return "Có thể nấu canh";
    }
}
