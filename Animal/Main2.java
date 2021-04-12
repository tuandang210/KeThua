package Animal;

public class Main2{
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]= new Apple();
        for (Fruit x: fruits){
            System.out.println(x.howtoEat());
        }
    }
}
