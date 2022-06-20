package shapes;

public class Rectangle {
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(double length, double width){
        return length * width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(double length, double width){
        return (2 * length) + (2 * width);
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    protected double length;
    protected double width;
}
