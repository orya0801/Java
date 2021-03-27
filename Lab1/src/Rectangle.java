public class Rectangle extends Parallelogram{
    private double x1, y1, x2, y2, x3, y3, x4, y4, e1, e2;

    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2,x3,y3,x4,y4);
        this.e1 = countLength(x1, y1, x2, y2);
        this.e2 = countLength(x2, y2, x3, y3);
    }

    @Override
    public double countHeight() {
        return this.e1;
    }
}
