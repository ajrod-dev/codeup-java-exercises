package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(4);
        Measurable myShape2 = new Rectangle(9,10);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println("---------------------");
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());



    }
}
