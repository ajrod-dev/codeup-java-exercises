package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        int count = 0;
        boolean makeMoreCircles = true;
        do {
            Input in = new Input();
            System.out.println("Enter a radius of your circle: ");
            Circle circle = new Circle(in.getDouble());
            System.out.printf("Circle has a circumference of %f?%n", circle.getCircumference());
            System.out.printf("Circle has an area of %f?%n", circle.getArea());
            count++;
            in.reset();
            System.out.println("Do you want to make another circle? [y] or [n]");
            makeMoreCircles = in.yesNo();
        }while (makeMoreCircles == true);

    }
}
