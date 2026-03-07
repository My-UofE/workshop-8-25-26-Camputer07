import shape.*;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        // Test the MoveablePoint class
        Moveable m1 = new MoveablePoint(50, 60, 10, 15); // upcast
        System.out.println(m1); //equivilant to println(m1.toString())
        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);

        System.out.println();

        // Test the MoveableCircle class
        MoveableCircle m2 = new MoveableCircle(1, 2, 3, 4, 20); 
        System.out.println(m2);
        m2.moveRight();
        m2.moveUp();
        System.out.println(m2);

        System.out.println();

        // Test the methods in the MoveableCircle class
        System.out.printf("Area:%.3f, Perimeter:%.3f%n", m2.area(), m2.perimeter());

        System.out.println();

        // Test the upcasting of a MoveableCircle to Moveable
        Shape m3 = new MoveableCircle(0, 0, 5, 5, 20); // upcast
        System.out.println(m3);
        m3.moveRight();
        m3.moveUp();
        System.out.println(m3);

        // Test the area() and perimeter() functions of MoveableCircle
        System.out.printf("Area:%.3f, Perimeter:%.3f%n", m3.area(), m3.perimeter());

        // Keep the terminal open
        Scanner in = new Scanner(System.in);
        in.nextLine();
        in.nextLine();
        in.close();
    }
}