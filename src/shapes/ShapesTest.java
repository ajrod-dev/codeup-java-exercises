package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Square(4);
        System.out.println(myShape.getArea());


    }
}
