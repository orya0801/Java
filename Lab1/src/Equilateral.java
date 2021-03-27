public class Equilateral extends Triangle{
    private double x1, y1, x2, y2, x3, y3, e;
    public Equilateral(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2,x3,y3);
        this.e = countLength(x1, y1, x2, y2);
    }

    @Override
    public double countSquare() {
        return Math.sqrt(3)/4*this.e*this.e;
    }

    @Override
    public double semiPerimeter() {
        return this.e*3/2;
    }
}
