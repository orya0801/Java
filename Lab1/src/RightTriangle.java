public class RightTriangle extends Triangle{
    private double x1, y1, x2, y2, x3, y3, x4, y4, e1, e2, e3;

    public RightTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2, x3, y3);
        this.e1 = countLength(x1, y1, x2, y2);
        this.e2 = countLength(x2, y2, x3, y3);
        this.e3 = countLength(x3, y3, x1, y1);
    }
}
