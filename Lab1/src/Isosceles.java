public class Isosceles extends Triangle{
    private double x1, y1, x2, y2, x3, y3, e1, e2;

    public Isosceles(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2,x3,y3);
        this.e1 = countLength(x1, y1, x2, y2);
        this.e2 = countLength(x2, y2, x3, y3);
    }

    @Override
    public double countSquare() {
        double p = semiPerimeter();
        return Math.sqrt(p*(p-this.e1)*(p-this.e2)*(p-this.e1));
    }

    @Override
    public double semiPerimeter() {
        return this.e1*2+this.e2;
    }
}
