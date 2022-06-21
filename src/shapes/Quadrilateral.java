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

    abstract void setLength();

    abstract void setWidth();

    protected int length;
    protected int width;
}
