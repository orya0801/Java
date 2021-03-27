public class Triangle extends Figure {
    private double x1, y1, x2, y2, x3, y3, x4, y4, e1, e2, e3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.e1 = countLength(x1, y1, x2, y2);
        this.e2 = countLength(x2, y2, x3, y3);
        this.e3 = countLength(x3, y3, x1, y1);
    }

    @Override
    public double countSquare() {
        double p = semiPerimeter();
        return Math.sqrt(p*(p-this.e1)*(p-this.e2)*(p-this.e3));
    }

    @Override
    public double countPerimeter() {
        return this.e1 + this.e2 + this.e3;
    }

    public double countLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

    public double countMedian(double a, double b, double c) {
        return 1/2*Math.sqrt(2*a*a+2*b*b-c*c);
    }

    public double countBisector(double a, double b, double c) {
        return Math.sqrt(a*b*(a+b+c)*(a+b-c))/(a+b);
    }

    public double semiPerimeter() {
        return (this.e1+this.e2+this.e3)/2;
    }

    public double inscribedCircleRadius() {
        return countSquare()/semiPerimeter();
    }

    public double circumscribedCircleRadius() {
        return this.e1*this.e2*this.e3/(4*countSquare());
    }
}
