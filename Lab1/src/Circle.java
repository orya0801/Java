public class Circle extends Figure{
    private double x1, y1, x2, y2, radius, diameter;

    public Circle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        this.radius = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        this.diameter = this.radius * 2;
    }

    @Override
    public double countSquare() {
        return 3.14 * Math.pow(this.radius, 2);
    }

    @Override
    public double countPerimeter() {
        return 3.14 * this.diameter;
    }
}
