package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println("Box1");
        System.out.println("Perimeter: " + box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Box2");
        System.out.println("Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());



    }
}
