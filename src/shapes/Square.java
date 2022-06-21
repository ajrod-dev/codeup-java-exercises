package shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    void setLength(int length) {
        this.length = length;
        width = length;
    }

    @Override
    void setWidth(int width) {
        this.width = width;
        length = width;
    }
}
