package Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,4);
        Point3D point3D = new Point3D(5, 3, 5);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.print(new Point2D(4,6));
        System.out.println(new Point3D());
    }
}
