public class Square extends Rhombus{
    private double x1, y1, x2, y2, x3, y3, x4, y4, e;
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2,x3,y3,x4,y4);
        this.e = countLength(x1, y1, x2, y2);
    }

    @Override
    public double countHeight() {
        return this.e;
    }

    @Override
    public double countSquare() {
        return this.e*this.e;
    }

    @Override
    public double countPerimeter() {
        return this.e*4;
    }
}
