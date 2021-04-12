package Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal x : animals) {
            System.out.println(x.makeSound());
            if (x instanceof Chicken) {
                System.out.println(((Chicken) x).howtoEat());
            }
        }
    }
}
