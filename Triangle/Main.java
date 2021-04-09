package Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ba cạnh của tam giác");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        Triangle triangle = new Triangle("đỏ", true, side1, side2, side3 );

        if(((side1+side2)>side3)&&((side1+side3)>side2)&&((side3+side2)>side1)){
            System.out.println(triangle);
        } else {
            System.out.println("Đó không phải ba cạnh tam giác");
        }

    }
}
