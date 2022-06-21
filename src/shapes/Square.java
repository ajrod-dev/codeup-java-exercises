package shapes;

public class Square extends Quadrilateral{

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }
}
