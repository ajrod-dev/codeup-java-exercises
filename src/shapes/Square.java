package shapes;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    protected double side;

    public double getArea(){
        return (double)Math.pow(this.side,2);
    };

    public double getPerimeter(){
        return 4 * side;
    }
}
