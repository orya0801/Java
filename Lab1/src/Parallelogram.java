public class Parallelogram extends Figure {
    private double x1, y1, x2, y2, x3, y3, x4, y4, e1, e2, e3, e4;

    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2);
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.e1 = countLength(x1, y1, x2, y2);
        this.e2 = countLength(x2, y2, x3, y3);
        this.e3 = countLength(x3, y3, x4, y4);
        this.e4 = countLength(x4, y4, x1, y1);
    }

    @Override
    public double countSquare() {
        return this.e4*countHeight();
    }

    @Override
    public double countPerimeter() {
        return this.e1 + this.e2 + this.e3 + this.e4;
    }

    public double countHeight() {
        double corner = Math.acos(this.e1*this.e1+this.e4*this.e4-countLength(x2, y2, x4, y4)*countLength(x2, y2, x4, y4)/(2*this.e1*this.e4));
        return e1*Math.sin(corner);
    }


    public double countLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

}
