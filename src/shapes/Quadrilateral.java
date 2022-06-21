package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract void setLength(int length);

    abstract void setWidth(int width);

    protected int length;
    protected int width;
}
